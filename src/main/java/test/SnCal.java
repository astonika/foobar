package test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//java版计算signature签名
public class SnCal {
	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		SnCal snCal = new SnCal();

		// 计算sn跟参数对出现顺序有关，get请求请使用LinkedHashMap保存<key,value>，该方法根据key的插入顺序排序；post请使用TreeMap保存<key,value>，该方法会自动将key按照字母a-z顺序排序。所以get请求可自定义参数顺序（sn参数必须在最后）发送请求，但是post请求必须按照字母a-z顺序填充body（sn参数必须在最后）。以get请求为例：http://api.map.baidu.com/geocoder/v2/?address=百度大厦&output=json&ak=yourak，paramsMap中先放入address，再放output，然后放ak，放入顺序必须跟get请求中对应参数的出现顺序保持一致。
		Map paramsMap = new LinkedHashMap<String, String>();
		paramsMap.put("address", "百度大厦");
		paramsMap.put("output", "json");
		paramsMap.put("ak", "yourak");

		// 调用下面的toQueryString方法，对LinkedHashMap内所有value作utf8编码，拼接返回结果address=%E7%99%BE%E5%BA%A6%E5%A4%A7%E5%8E%A6&output=json&ak=yourak
		String paramsStr = snCal.toQueryString(paramsMap);

		// 对paramsStr前面拼接上/geocoder/v2/?，后面直接拼接yoursk得到/geocoder/v2/?address=%E7%99%BE%E5%BA%A6%E5%A4%A7%E5%8E%A6&output=json&ak=yourakyoursk
		String wholeStr = new String("/geocoder/v2/?" + paramsStr + "yoursk");

		// 对上面wholeStr再作utf8编码
		String tempStr = URLEncoder.encode(wholeStr, "UTF-8");

		// 调用下面的MD5方法得到最后的sn签名7de5a22212ffaa9e326444c75a58f9a0
		System.out.println(snCal.MD5(tempStr));
	}

	// 对Map内所有value作utf8编码，拼接返回结果
	public String toQueryString(Map<?, ?> data) throws UnsupportedEncodingException {
		StringBuffer queryString = new StringBuffer();
		for (Entry<?, ?> pair : data.entrySet()) {
			queryString.append(pair.getKey() + "=");
			queryString.append(URLEncoder.encode((String) pair.getValue(), "UTF-8") + "&");
		}
		if (queryString.length() > 0) {
			queryString.deleteCharAt(queryString.length() - 1);
		}
		return queryString.toString();
	}

	// 来自stackoverflow的MD5计算方法，调用了MessageDigest库函数，并把byte数组结果转换成16进制
	public String MD5(String md5) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
			byte[] array = md.digest(md5.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
		}
		return null;
	}
}

//附录3：控制服务返回码定义
//状态码 	定义 	注释
//0 	正常 	
//1 	服务器内部错误 	该服务响应超时或系统内部错误，请留下联系方式
//10 	上传内容超过8M 	Post上传数据不能超过8M
//101 	AK参数不存在 	请求消息没有携带AK参数
//102 	MCODE参数不存在，mobile类型mcode参数必需 	对于Mobile类型的应用请求需要携带mcode参数，该错误码代表服务器没有解析到mcode
//200 	APP不存在，AK有误请检查再重试 	根据请求的ak，找不到对应的APP
//201 	APP被用户自己禁用，请在控制台解禁 	
//202 	APP被管理员删除 	恶意APP被管理员删除
//203 	APP类型错误 	当前API控制台支持Server(类型1), Mobile(类型2, 新版控制台区分为Mobile_Android(类型21)及Mobile_IPhone（类型22））及Browser（类型3），除此之外其他类型认为是APP类型错误
//210 	APP IP校验失败 	在申请SERVER类型应用的时候选择IP校验，需要填写IP白名单，如果当前请求的IP地址不在IP白名单或者不是0.0.0.0/0就认为IP校验失败
//211 	APP SN校验失败 	SERVER类型APP有两种校验方式IP校验和SN校验，当用户请求的SN和服务端计算出来的SN不相等的时候提示SN校验失败
//220 	APP Referer校验失败 	浏览器类型的APP会校验referer字段是否存且切在referer白名单里面，否则返回该错误码
//230 	APP Mcode码校验失败 	服务器能解析到mcode，但和数据库中不一致，请携带正确的mcode
//240 	APP 服务被禁用 	用户在API控制台中创建或设置某APP的时候禁用了某项服务
//250 	用户不存在 	根据请求的user_id, 数据库中找不到该用户的信息，请携带正确的user_id
//251 	用户被自己删除 	该用户处于未激活状态
//252 	用户被管理员删除 	恶意用户被加入黑名单
//260 	服务不存在 	服务器解析不到用户请求的服务名称
//261 	服务被禁用 	该服务已下线
//301 	永久配额超限，限制访问 	配额超限，如果想增加配额请联系我们
//302 	天配额超限，限制访问 	配额超限，如果想增加配额请联系我们
//401 	当前并发量已经超过约定并发配额，限制访问 	并发控制超限，请控制并发量或联系我们
//402 	当前并发量已经超过约定并发配额，并且服务总并发量也已经超过设定的总并发配额，限制访问 	并发控制超限，请控制并发量或联系我们