package com.company.project.service.impl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.company.project.model.Record;
import com.company.project.service.FooBarService;
import com.company.project.util.AntiVC;
import com.company.project.util.Page;

@Service
public class FooBarServiceImpl implements FooBarService {

	private RestTemplate restTemplate = new RestTemplate();
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private String txtUserName;
	private String pwd;
	private String sessionID;
	private String method;
	private String city;
	private String levels;
	private String codes;
	private String multiCode;
	private String page;
	private String rows;
	private String showUpload;
	private String showValidate;
	private String fault;
	private String host;
	private String start;
	private String end;
	private String index;
	private String sort;
	private String subid;
	private String subname;
	private String tmpJpg;

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
		this.simpleDateFormat = simpleDateFormat;
	}

	public void setTxtUserName(String txtUserName) {
		this.txtUserName = txtUserName;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

	public void setCodes(String codes) {
		this.codes = codes;
	}

	public void setMultiCode(String multiCode) {
		this.multiCode = multiCode;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public void setShowUpload(String showUpload) {
		this.showUpload = showUpload;
	}

	public void setShowValidate(String showValidate) {
		this.showValidate = showValidate;
	}

	public void setFault(String fault) {
		this.fault = fault;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public void setSubid(String subid) {
		this.subid = subid;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public void setTmpJpg(String tmpJpg) {
		this.tmpJpg = tmpJpg;
	}

	public void setUseLink(String useLink) {
		this.useLink = useLink;
	}

	public void setWasteGas(String wasteGas) {
		this.wasteGas = wasteGas;
	}

	public void setWasteWater(String wasteWater) {
		this.wasteWater = wasteWater;
	}

	public void setHistoryWasteGas(String historyWasteGas) {
		this.historyWasteGas = historyWasteGas;
	}

	public void setHistoryWasteWater(String historyWasteWater) {
		this.historyWasteWater = historyWasteWater;
	}

	public void setValidCodeImg(String validCodeImg) {
		this.validCodeImg = validCodeImg;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setRequestEntity(HttpEntity<MultiValueMap<String, String>> requestEntity) {
		this.requestEntity = requestEntity;
	}

	public void setTypeReference(TypeReference<Page<Record>> typeReference) {
		this.typeReference = typeReference;
	}

	public void setParameters(MultiValueMap<String, String> parameters) {
		this.parameters = parameters;
	}

	@Override
	public void login() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		List<Charset> acceptCharset = new ArrayList<Charset>();
		acceptCharset.add(Charset.forName("UTF-8"));
		headers.setAcceptCharset(acceptCharset);
		headers.set("Cookie",
				"ASP.NET_SessionId=" + sessionID + "; autoLogin=true; user=" + txtUserName + "; pwd=" + pwd);
		MultiValueMap<String, String> loginParameters = new LinkedMultiValueMap<String, String>();
		loginParameters.add("txtUserName", txtUserName);
		loginParameters.add("pwd", pwd);

		String host = "60.213.30.214:8805";
		String wasteGas = "http://" + host + "/Login.aspx";

		HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(
				loginParameters, headers);
		ResponseEntity<String> response = restTemplate.exchange(wasteGas, HttpMethod.POST, requestEntity, String.class);
		// if (response.getStatusCode().equals(HttpStatus.OK)) {
		// System.out.println(response);
		// page = JSON.parseObject(response.getBody(), Page.class);
		// System.out.println(page);
		// }
	}

	private String useLink;
	private String wasteGas;
	private String wasteWater;
	private String historyWasteGas;
	private String historyWasteWater;
	private String validCodeImg;
	private String login;
	private HttpEntity<MultiValueMap<String, String>> requestEntity;
	private TypeReference<Page<Record>> typeReference;
	private MultiValueMap<String, String> parameters;

	// http://60.213.30.214:8805/ajax/WasteGas/QueryAnalysis/HistoryReportQUIDYN/HistoryReport.ashx
	public void initMethod() {
		wasteWater = "http://" + host + "/ajax/WasteWater/RealTime/RealTimeDataQUIDYN/RealTimeData.ashx";
		wasteGas = "http://" + host + "/ajax/WasteGas/RealTime/RealTimeDataQUIDYN/RealTimeData.ashx";
		historyWasteWater = "http://" + host + "/ajax/WasteWater/QueryAnalysis/HistoryReportQUIDYN/HistoryReport.ashx";
		historyWasteGas = "http://" + host + "/ajax/WasteGas/QueryAnalysis/HistoryReportQUIDYN/HistoryReport.ashx";
		useLink = historyWasteGas;
		validCodeImg = "http://" + host + "/Ajax/ValidCodeImg.ashx";
		login = "http://" + host + "/Ajax/Login.ashx";
		// http://60.213.30.214:8805/Ajax/Login.ashx?Method=G3_Login&loginname=jnhb&password=1&validcode=3&random=0.393999214284122&_=1496302604495
		HttpHeaders headers = new HttpHeaders();
		// List<MediaType> accept = new ArrayList<MediaType>();
		// accept.add(MediaType.APPLICATION_JSON);
		// accept.add("text/javascript");
		// accept.add(MediaType.ALL);
		// accept.add(MediaType.PARAM_QUALITY_FACTOR);
		// headers.setAccept(accept);
		headers.set(HttpHeaders.HOST, host);
		headers.set(HttpHeaders.USER_AGENT,
				"Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:59.0) Gecko/20100101 Firefox/59.0");
		headers.set(HttpHeaders.ACCEPT, "application/json, text/javascript, */*; q=0.01");
		headers.set(HttpHeaders.ACCEPT_LANGUAGE, "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
		headers.set(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate");
		headers.set(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
		headers.set("X-Requested-With", "XMLHttpRequest");
		headers.set(HttpHeaders.REFERER,
				"http://" + host + "/WasteGas/QueryAnalysis/HistoryReportQUIDYN/HistoryReport.aspx");
		headers.setContentLength(353);
		headers.set(HttpHeaders.COOKIE,
				"ASP.NET_SessionId=" + sessionID + "; autoLogin=true; user=" + txtUserName + "; pwd=" + pwd);
		headers.setConnection("keep-alive");
		parameters = new LinkedMultiValueMap<String, String>();
		// parameters.add("city", city);
		// parameters.add("levels", levels);
		parameters.add("codes", codes);
		parameters.add("end", end);
		parameters.add("index", index);
		parameters.add("Method", method);
		parameters.add("multiCode", multiCode);
		parameters.add("page", page);
		parameters.add("rows", rows);
		parameters.add("showUpload", showUpload);
		parameters.add("showValidate", showValidate);
		// parameters.add("fault", fault);
		parameters.add("sort", sort);
		parameters.add("start", start);
		parameters.add("subid", subid);
		// parameters.add("subname", subname);

		requestEntity = new HttpEntity<MultiValueMap<String, String>>(parameters, headers);
		typeReference = new TypeReference<Page<Record>>() {
		};
	}

	@Override
	public Page<Record> xinxingcailiao() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, -1);
		parameters.set("start", simpleDateFormat.format(calendar.getTime()));
		parameters.set("end", simpleDateFormat.format(new Date()));
//		parameters.set("start", "2018-12-14 23:50:00");
//		parameters.set("end", "2018-12-15 23:50:59");
//		<{codes=[316,311,494,495,313,466], end=[2018-12-15 23:50:19], index=[0], Method=[QueryHistoryReport], multiCode=[316,311,313,466,494], page=[1], rows=[1], showUpload=[0], showValidate=[0], sort=[0], start=[2018-12-14 23:50:19], subid=[13612]},{Host=[60.213.30.214:8805], User-Agent=[Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:59.0) Gecko/20100101 Firefox/59.0], Accept=[application/json, text/javascript, */*; q=0.01], Accept-Language=[zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2], Accept-Encoding=[gzip, deflate], Content-Type=[application/x-www-form-urlencoded; charset=UTF-8], X-Requested-With=[XMLHttpRequest], Referer=[http://60.213.30.214:8805/WasteGas/QueryAnalysis/HistoryReportQUIDYN/HistoryReport.aspx], Content-Length=[353], Cookie=[ASP.NET_SessionId=stindzmvqhcw1o55bc115t55; autoLogin=true; user=jnhb; pwd=1], Connection=[keep-alive]}>
//		                                                                                                                                                                                                                                                                                                                                                                                   <200 OK,{ "total":1438,"rows":[],"pf_flow":""},{Cache-Control=[private], Content-Type=[text/plain; charset=utf-8], Server=[Microsoft-IIS/7.0], X-AspNet-Version=[2.0.50727], X-Powered-By=[ASP.NET], Date=[Sat, 15 Dec 2018 15:50:07 GMT], Content-Length=[38]}>
		ResponseEntity<String> response = restTemplate.exchange(useLink, HttpMethod.POST, requestEntity, String.class);
		System.err.println(requestEntity);
		System.err.println(response);
		Page<Record> page = null;
		if (response.getStatusCode().equals(HttpStatus.OK)) {
			try {
				System.out.println(response.getBody());
				page = JSON.parseObject(response.getBody(), typeReference);
			} catch (Exception e) {
				HttpHeaders validCodeImgHttpHeaders = new HttpHeaders();
				InputStream inputStream = null;
				OutputStream outputStream = null;
				ResponseEntity<byte[]> responseEntity;
				try {
					validCodeImgHttpHeaders.add(HttpHeaders.HOST, host);
					validCodeImgHttpHeaders.set(HttpHeaders.USER_AGENT,
							"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:52.0) Gecko/20100101 Firefox/52.0");
					validCodeImgHttpHeaders.add(HttpHeaders.ACCEPT, MediaType.IMAGE_JPEG_VALUE);
					validCodeImgHttpHeaders.set(HttpHeaders.ACCEPT_LANGUAGE, "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");
					validCodeImgHttpHeaders.set(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate");
					validCodeImgHttpHeaders.set(HttpHeaders.REFERER, "http://60.213.30.214:8805/Login.aspx");
					validCodeImgHttpHeaders.set(HttpHeaders.COOKIE, "ASP.NET_SessionId=" + sessionID
							+ "; autoLogin=true; user=" + txtUserName + "; pwd=" + pwd);
					validCodeImgHttpHeaders.setConnection("keep-alive");
					responseEntity = restTemplate.exchange(validCodeImg, HttpMethod.GET,
							new HttpEntity<byte[]>(validCodeImgHttpHeaders), byte[].class);
					byte[] result = responseEntity.getBody();
					// System.out.println(responseEntity.getHeaders().get(
					// HttpHeaders.SET_COOKIE));
					// {Cache-Control=[private], Content-Type=[image/Jpeg],
					// Server=[Microsoft-IIS/7.0], X-AspNet-Version=[2.0.50727],
					// X-Powered-By=[ASP.NET], Date=[Thu, 01 Jun 2017 06:41:44
					// GMT], Content-Length=[1412]}
					// {Cache-Control=[private], Content-Type=[image/Jpeg],
					// Server=[Microsoft-IIS/7.0], X-AspNet-Version=[2.0.50727],
					// X-Powered-By=[ASP.NET], Date=[Thu, 01 Jun 2017 06:49:07
					// GMT], Content-Length=[1389]}
					String setCookie = responseEntity.getHeaders().getFirst(HttpHeaders.SET_COOKIE);
					System.out.println(setCookie);
					setCookie = "ASP.NET_SessionId=ctir3fu4kyzs1lqwhsctdzmx; path=/; HttpOnly";

					inputStream = new ByteArrayInputStream(result);
					File file = new File(tmpJpg);
					file.createNewFile();
					outputStream = new FileOutputStream(file);
					int len = 0;
					byte[] buf = new byte[1024];
					while ((len = inputStream.read(buf, 0, 1024)) != -1) {
						outputStream.write(buf, 0, len);
					}
					outputStream.flush();
				} catch (Exception e3) {
					e.printStackTrace();
				} finally {
					if (inputStream != null) {
						try {
							inputStream.close();
						} catch (IOException e2) {
							e2.printStackTrace();
						}
					}
					if (outputStream != null) {
						try {
							outputStream.close();
						} catch (IOException e4) {
							e4.printStackTrace();
						}
					}
				}

				AntiVC antiVC = new AntiVC();
				antiVC.initMethod();
				antiVC.getVcodeFromFile(1, tmpJpg);
				// System.out.println(antiVC.getVcodeFromFile(1,
				// "D:\\Test\\CheckCodeTest\\1.jpg"));
				// if (antiVC.getVcode().length() == 4) {
				String formula = antiVC.getVcode();
				antiVC.destory();
				System.err.println(" ====== " + formula);
				Integer validcode = null;
				if (formula.contains("+")) {
					validcode = Integer.parseInt(formula.substring(0, 1)) + Integer.parseInt(formula.substring(2, 3));
				} else if (formula.contains("-")) {
					validcode = Integer.parseInt(formula.substring(0, 1)) - Integer.parseInt(formula.substring(2, 3));
				}

				HttpHeaders loginHttpHeaders = new HttpHeaders();
				loginHttpHeaders.add(HttpHeaders.HOST, host);
				loginHttpHeaders.set(HttpHeaders.USER_AGENT,
						"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:52.0) Gecko/20100101 Firefox/52.0");
				loginHttpHeaders.add(HttpHeaders.ACCEPT, "text/plain, */*; q=0.01");
				loginHttpHeaders.set(HttpHeaders.ACCEPT_LANGUAGE, "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");
				loginHttpHeaders.set(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate");
				loginHttpHeaders.set("X-Requested-With", "XMLHttpRequest");
				loginHttpHeaders.set(HttpHeaders.REFERER, "http://60.213.30.214:8805/Login.aspx");
				loginHttpHeaders.set(HttpHeaders.COOKIE,
						"ASP.NET_SessionId=" + sessionID + "; autoLogin=true; user=" + txtUserName + "; pwd=" + pwd);
				loginHttpHeaders.setConnection("keep-alive");
				MultiValueMap<String, String> g3login = new LinkedMultiValueMap<String, String>();
				g3login.add("Method", "G3_Login");
				g3login.add("loginname", "jnhb");
				g3login.add("password", "1");
				g3login.add("validcode", validcode.toString());
				// parameters.add("random", "0.4793399226421974");
				// parameters.add("_", "1495256288709");
				// Ajax/ValidCodeImg.ashx?0.5934303281828761
				ResponseEntity<String> response2 = restTemplate.exchange(login, HttpMethod.POST,
						new HttpEntity<MultiValueMap<String, String>>(g3login, loginHttpHeaders), String.class);

				// }
				System.out.println(response2.getBody());
			}
		}
		return page;
	}

}
