package com.company.project.model;

public class Record extends BaseModel<Long> {
	/**
	 * 
	 */
	private static long serialVersionUID = 1L;
	private String sn;
	private String dateTime;
	private String stcode;
	private String stname;
	private String enterpriseName;
	private String subID;
	private String subName;
	private String status;
	private String rownum;

	// val折算浓度

	// 201二氧化硫
	// 203氮氧化物
	// 207烟尘
	// 209氧气
	// 210废气排放量
	// 211流速
	// 525烟气温度
	// 311氨氮
	// 313
	// 316化学需氧量
	// 466
	// 494
	// 495累计流量

	private String pid_201;
	private String pid_203;
	private String pid_207;
	private String pid_209;
	private String pid_210;
	private String pid_211;
	private String pid_525;
	private String pid_311;
	private String pid_313;
	private String pid_316;
	private String pid_466;
	private String pid_494;
	private String pid_495;

	private String val_201;
	private String val_203;
	private String val_207;
	private String val_209;
	private String val_210;
	private String val_211;
	private String val_525;
	private String val_311;
	private String val_313;
	private String val_316;
	private String val_466;
	private String val_494;
	private String val_495;

	private String cvt_201;
	private String cvt_203;
	private String cvt_207;
	private String cvt_209;
	private String cvt_210;
	private String cvt_211;
	private String cvt_525;
	private String cvt_311;
	private String cvt_313;
	private String cvt_316;
	private String cvt_466;
	private String cvt_494;
	private String cvt_495;

	private String stand_201;
	private String stand_203;
	private String stand_207;
	private String stand_209;
	private String stand_210;
	private String stand_211;
	private String stand_525;
	private String stand_311;
	private String stand_313;
	private String stand_316;
	private String stand_466;
	private String stand_494;
	private String stand_495;

	private String cbbs_201;
	private String cbbs_203;
	private String cbbs_207;
	private String cbbs_209;
	private String cbbs_210;
	private String cbbs_211;
	private String cbbs_525;
	private String cbbs_311;
	private String cbbs_313;
	private String cbbs_316;
	private String cbbs_466;
	private String cbbs_494;
	private String cbbs_495;

	private String low_201;
	private String low_203;
	private String low_207;
	private String low_209;
	private String low_210;
	private String low_211;
	private String low_525;
	private String low_311;
	private String low_313;
	private String low_316;
	private String low_466;
	private String low_494;
	private String low_495;

	private String high_201;
	private String high_203;
	private String high_207;
	private String high_209;
	private String high_210;
	private String high_211;
	private String high_525;
	private String high_311;
	private String high_313;
	private String high_316;
	private String high_466;
	private String high_494;
	private String high_495;

	private String state_201;
	private String state_203;
	private String state_207;
	private String state_209;
	private String state_210;
	private String state_211;
	private String state_525;
	private String state_311;
	private String state_313;
	private String state_316;
	private String state_466;
	private String state_494;
	private String state_495;

	private String ex_201;
	private String ex_203;
	private String ex_207;
	private String ex_209;
	private String ex_210;
	private String ex_211;
	private String ex_525;
	private String ex_311;
	private String ex_313;
	private String ex_316;
	private String ex_466;
	private String ex_494;
	private String ex_495;

	private String val2_201;
	private String val2_203;
	private String val2_207;
	private String val2_209;
	private String val2_210;
	private String val2_211;
	private String val2_525;
	private String val2_311;
	private String val2_313;
	private String val2_316;
	private String val2_466;
	private String val2_494;
	private String val2_495;

	private String datatime_201;
	private String datatime_203;
	private String datatime_207;
	private String datatime_209;
	private String datatime_210;
	private String datatime_211;
	private String datatime_525;
	private String datatime_311;
	private String datatime_313;
	private String datatime_316;
	private String datatime_466;
	private String datatime_494;
	private String datatime_495;

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getStcode() {
		return stcode;
	}

	public void setStcode(String stcode) {
		this.stcode = stcode;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getSubID() {
		return subID;
	}

	public void setSubID(String subID) {
		this.subID = subID;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRownum() {
		return rownum;
	}

	public void setRownum(String rownum) {
		this.rownum = rownum;
	}

	public String getPid_201() {
		return pid_201;
	}

	public void setPid_201(String pid_201) {
		this.pid_201 = pid_201;
	}

	public String getPid_203() {
		return pid_203;
	}

	public void setPid_203(String pid_203) {
		this.pid_203 = pid_203;
	}

	public String getPid_207() {
		return pid_207;
	}

	public void setPid_207(String pid_207) {
		this.pid_207 = pid_207;
	}

	public String getPid_209() {
		return pid_209;
	}

	public void setPid_209(String pid_209) {
		this.pid_209 = pid_209;
	}

	public String getPid_210() {
		return pid_210;
	}

	public void setPid_210(String pid_210) {
		this.pid_210 = pid_210;
	}

	public String getPid_211() {
		return pid_211;
	}

	public void setPid_211(String pid_211) {
		this.pid_211 = pid_211;
	}

	public String getPid_525() {
		return pid_525;
	}

	public void setPid_525(String pid_525) {
		this.pid_525 = pid_525;
	}

	public String getPid_311() {
		return pid_311;
	}

	public void setPid_311(String pid_311) {
		this.pid_311 = pid_311;
	}

	public String getPid_313() {
		return pid_313;
	}

	public void setPid_313(String pid_313) {
		this.pid_313 = pid_313;
	}

	public String getPid_316() {
		return pid_316;
	}

	public void setPid_316(String pid_316) {
		this.pid_316 = pid_316;
	}

	public String getPid_466() {
		return pid_466;
	}

	public void setPid_466(String pid_466) {
		this.pid_466 = pid_466;
	}

	public String getPid_494() {
		return pid_494;
	}

	public void setPid_494(String pid_494) {
		this.pid_494 = pid_494;
	}

	public String getPid_495() {
		return pid_495;
	}

	public void setPid_495(String pid_495) {
		this.pid_495 = pid_495;
	}

	public String getVal_201() {
		return val_201;
	}

	public void setVal_201(String val_201) {
		this.val_201 = val_201;
	}

	public String getVal_203() {
		return val_203;
	}

	public void setVal_203(String val_203) {
		this.val_203 = val_203;
	}

	public String getVal_207() {
		return val_207;
	}

	public void setVal_207(String val_207) {
		this.val_207 = val_207;
	}

	public String getVal_209() {
		return val_209;
	}

	public void setVal_209(String val_209) {
		this.val_209 = val_209;
	}

	public String getVal_210() {
		return val_210;
	}

	public void setVal_210(String val_210) {
		this.val_210 = val_210;
	}

	public String getVal_211() {
		return val_211;
	}

	public void setVal_211(String val_211) {
		this.val_211 = val_211;
	}

	public String getVal_525() {
		return val_525;
	}

	public void setVal_525(String val_525) {
		this.val_525 = val_525;
	}

	public String getVal_311() {
		return val_311;
	}

	public void setVal_311(String val_311) {
		this.val_311 = val_311;
	}

	public String getVal_313() {
		return val_313;
	}

	public void setVal_313(String val_313) {
		this.val_313 = val_313;
	}

	public String getVal_316() {
		return val_316;
	}

	public void setVal_316(String val_316) {
		this.val_316 = val_316;
	}

	public String getVal_466() {
		return val_466;
	}

	public void setVal_466(String val_466) {
		this.val_466 = val_466;
	}

	public String getVal_494() {
		return val_494;
	}

	public void setVal_494(String val_494) {
		this.val_494 = val_494;
	}

	public String getVal_495() {
		return val_495;
	}

	public void setVal_495(String val_495) {
		this.val_495 = val_495;
	}

	public String getCvt_201() {
		return cvt_201;
	}

	public void setCvt_201(String cvt_201) {
		this.cvt_201 = cvt_201;
	}

	public String getCvt_203() {
		return cvt_203;
	}

	public void setCvt_203(String cvt_203) {
		this.cvt_203 = cvt_203;
	}

	public String getCvt_207() {
		return cvt_207;
	}

	public void setCvt_207(String cvt_207) {
		this.cvt_207 = cvt_207;
	}

	public String getCvt_209() {
		return cvt_209;
	}

	public void setCvt_209(String cvt_209) {
		this.cvt_209 = cvt_209;
	}

	public String getCvt_210() {
		return cvt_210;
	}

	public void setCvt_210(String cvt_210) {
		this.cvt_210 = cvt_210;
	}

	public String getCvt_211() {
		return cvt_211;
	}

	public void setCvt_211(String cvt_211) {
		this.cvt_211 = cvt_211;
	}

	public String getCvt_525() {
		return cvt_525;
	}

	public void setCvt_525(String cvt_525) {
		this.cvt_525 = cvt_525;
	}

	public String getCvt_311() {
		return cvt_311;
	}

	public void setCvt_311(String cvt_311) {
		this.cvt_311 = cvt_311;
	}

	public String getCvt_313() {
		return cvt_313;
	}

	public void setCvt_313(String cvt_313) {
		this.cvt_313 = cvt_313;
	}

	public String getCvt_316() {
		return cvt_316;
	}

	public void setCvt_316(String cvt_316) {
		this.cvt_316 = cvt_316;
	}

	public String getCvt_466() {
		return cvt_466;
	}

	public void setCvt_466(String cvt_466) {
		this.cvt_466 = cvt_466;
	}

	public String getCvt_494() {
		return cvt_494;
	}

	public void setCvt_494(String cvt_494) {
		this.cvt_494 = cvt_494;
	}

	public String getCvt_495() {
		return cvt_495;
	}

	public void setCvt_495(String cvt_495) {
		this.cvt_495 = cvt_495;
	}

	public String getStand_201() {
		return stand_201;
	}

	public void setStand_201(String stand_201) {
		this.stand_201 = stand_201;
	}

	public String getStand_203() {
		return stand_203;
	}

	public void setStand_203(String stand_203) {
		this.stand_203 = stand_203;
	}

	public String getStand_207() {
		return stand_207;
	}

	public void setStand_207(String stand_207) {
		this.stand_207 = stand_207;
	}

	public String getStand_209() {
		return stand_209;
	}

	public void setStand_209(String stand_209) {
		this.stand_209 = stand_209;
	}

	public String getStand_210() {
		return stand_210;
	}

	public void setStand_210(String stand_210) {
		this.stand_210 = stand_210;
	}

	public String getStand_211() {
		return stand_211;
	}

	public void setStand_211(String stand_211) {
		this.stand_211 = stand_211;
	}

	public String getStand_525() {
		return stand_525;
	}

	public void setStand_525(String stand_525) {
		this.stand_525 = stand_525;
	}

	public String getStand_311() {
		return stand_311;
	}

	public void setStand_311(String stand_311) {
		this.stand_311 = stand_311;
	}

	public String getStand_313() {
		return stand_313;
	}

	public void setStand_313(String stand_313) {
		this.stand_313 = stand_313;
	}

	public String getStand_316() {
		return stand_316;
	}

	public void setStand_316(String stand_316) {
		this.stand_316 = stand_316;
	}

	public String getStand_466() {
		return stand_466;
	}

	public void setStand_466(String stand_466) {
		this.stand_466 = stand_466;
	}

	public String getStand_494() {
		return stand_494;
	}

	public void setStand_494(String stand_494) {
		this.stand_494 = stand_494;
	}

	public String getStand_495() {
		return stand_495;
	}

	public void setStand_495(String stand_495) {
		this.stand_495 = stand_495;
	}

	public String getCbbs_201() {
		return cbbs_201;
	}

	public void setCbbs_201(String cbbs_201) {
		this.cbbs_201 = cbbs_201;
	}

	public String getCbbs_203() {
		return cbbs_203;
	}

	public void setCbbs_203(String cbbs_203) {
		this.cbbs_203 = cbbs_203;
	}

	public String getCbbs_207() {
		return cbbs_207;
	}

	public void setCbbs_207(String cbbs_207) {
		this.cbbs_207 = cbbs_207;
	}

	public String getCbbs_209() {
		return cbbs_209;
	}

	public void setCbbs_209(String cbbs_209) {
		this.cbbs_209 = cbbs_209;
	}

	public String getCbbs_210() {
		return cbbs_210;
	}

	public void setCbbs_210(String cbbs_210) {
		this.cbbs_210 = cbbs_210;
	}

	public String getCbbs_211() {
		return cbbs_211;
	}

	public void setCbbs_211(String cbbs_211) {
		this.cbbs_211 = cbbs_211;
	}

	public String getCbbs_525() {
		return cbbs_525;
	}

	public void setCbbs_525(String cbbs_525) {
		this.cbbs_525 = cbbs_525;
	}

	public String getCbbs_311() {
		return cbbs_311;
	}

	public void setCbbs_311(String cbbs_311) {
		this.cbbs_311 = cbbs_311;
	}

	public String getCbbs_313() {
		return cbbs_313;
	}

	public void setCbbs_313(String cbbs_313) {
		this.cbbs_313 = cbbs_313;
	}

	public String getCbbs_316() {
		return cbbs_316;
	}

	public void setCbbs_316(String cbbs_316) {
		this.cbbs_316 = cbbs_316;
	}

	public String getCbbs_466() {
		return cbbs_466;
	}

	public void setCbbs_466(String cbbs_466) {
		this.cbbs_466 = cbbs_466;
	}

	public String getCbbs_494() {
		return cbbs_494;
	}

	public void setCbbs_494(String cbbs_494) {
		this.cbbs_494 = cbbs_494;
	}

	public String getCbbs_495() {
		return cbbs_495;
	}

	public void setCbbs_495(String cbbs_495) {
		this.cbbs_495 = cbbs_495;
	}

	public String getLow_201() {
		return low_201;
	}

	public void setLow_201(String low_201) {
		this.low_201 = low_201;
	}

	public String getLow_203() {
		return low_203;
	}

	public void setLow_203(String low_203) {
		this.low_203 = low_203;
	}

	public String getLow_207() {
		return low_207;
	}

	public void setLow_207(String low_207) {
		this.low_207 = low_207;
	}

	public String getLow_209() {
		return low_209;
	}

	public void setLow_209(String low_209) {
		this.low_209 = low_209;
	}

	public String getLow_210() {
		return low_210;
	}

	public void setLow_210(String low_210) {
		this.low_210 = low_210;
	}

	public String getLow_211() {
		return low_211;
	}

	public void setLow_211(String low_211) {
		this.low_211 = low_211;
	}

	public String getLow_525() {
		return low_525;
	}

	public void setLow_525(String low_525) {
		this.low_525 = low_525;
	}

	public String getLow_311() {
		return low_311;
	}

	public void setLow_311(String low_311) {
		this.low_311 = low_311;
	}

	public String getLow_313() {
		return low_313;
	}

	public void setLow_313(String low_313) {
		this.low_313 = low_313;
	}

	public String getLow_316() {
		return low_316;
	}

	public void setLow_316(String low_316) {
		this.low_316 = low_316;
	}

	public String getLow_466() {
		return low_466;
	}

	public void setLow_466(String low_466) {
		this.low_466 = low_466;
	}

	public String getLow_494() {
		return low_494;
	}

	public void setLow_494(String low_494) {
		this.low_494 = low_494;
	}

	public String getLow_495() {
		return low_495;
	}

	public void setLow_495(String low_495) {
		this.low_495 = low_495;
	}

	public String getHigh_201() {
		return high_201;
	}

	public void setHigh_201(String high_201) {
		this.high_201 = high_201;
	}

	public String getHigh_203() {
		return high_203;
	}

	public void setHigh_203(String high_203) {
		this.high_203 = high_203;
	}

	public String getHigh_207() {
		return high_207;
	}

	public void setHigh_207(String high_207) {
		this.high_207 = high_207;
	}

	public String getHigh_209() {
		return high_209;
	}

	public void setHigh_209(String high_209) {
		this.high_209 = high_209;
	}

	public String getHigh_210() {
		return high_210;
	}

	public void setHigh_210(String high_210) {
		this.high_210 = high_210;
	}

	public String getHigh_211() {
		return high_211;
	}

	public void setHigh_211(String high_211) {
		this.high_211 = high_211;
	}

	public String getHigh_525() {
		return high_525;
	}

	public void setHigh_525(String high_525) {
		this.high_525 = high_525;
	}

	public String getHigh_311() {
		return high_311;
	}

	public void setHigh_311(String high_311) {
		this.high_311 = high_311;
	}

	public String getHigh_313() {
		return high_313;
	}

	public void setHigh_313(String high_313) {
		this.high_313 = high_313;
	}

	public String getHigh_316() {
		return high_316;
	}

	public void setHigh_316(String high_316) {
		this.high_316 = high_316;
	}

	public String getHigh_466() {
		return high_466;
	}

	public void setHigh_466(String high_466) {
		this.high_466 = high_466;
	}

	public String getHigh_494() {
		return high_494;
	}

	public void setHigh_494(String high_494) {
		this.high_494 = high_494;
	}

	public String getHigh_495() {
		return high_495;
	}

	public void setHigh_495(String high_495) {
		this.high_495 = high_495;
	}

	public String getState_201() {
		return state_201;
	}

	public void setState_201(String state_201) {
		this.state_201 = state_201;
	}

	public String getState_203() {
		return state_203;
	}

	public void setState_203(String state_203) {
		this.state_203 = state_203;
	}

	public String getState_207() {
		return state_207;
	}

	public void setState_207(String state_207) {
		this.state_207 = state_207;
	}

	public String getState_209() {
		return state_209;
	}

	public void setState_209(String state_209) {
		this.state_209 = state_209;
	}

	public String getState_210() {
		return state_210;
	}

	public void setState_210(String state_210) {
		this.state_210 = state_210;
	}

	public String getState_211() {
		return state_211;
	}

	public void setState_211(String state_211) {
		this.state_211 = state_211;
	}

	public String getState_525() {
		return state_525;
	}

	public void setState_525(String state_525) {
		this.state_525 = state_525;
	}

	public String getState_311() {
		return state_311;
	}

	public void setState_311(String state_311) {
		this.state_311 = state_311;
	}

	public String getState_313() {
		return state_313;
	}

	public void setState_313(String state_313) {
		this.state_313 = state_313;
	}

	public String getState_316() {
		return state_316;
	}

	public void setState_316(String state_316) {
		this.state_316 = state_316;
	}

	public String getState_466() {
		return state_466;
	}

	public void setState_466(String state_466) {
		this.state_466 = state_466;
	}

	public String getState_494() {
		return state_494;
	}

	public void setState_494(String state_494) {
		this.state_494 = state_494;
	}

	public String getState_495() {
		return state_495;
	}

	public void setState_495(String state_495) {
		this.state_495 = state_495;
	}

	public String getEx_201() {
		return ex_201;
	}

	public void setEx_201(String ex_201) {
		this.ex_201 = ex_201;
	}

	public String getEx_203() {
		return ex_203;
	}

	public void setEx_203(String ex_203) {
		this.ex_203 = ex_203;
	}

	public String getEx_207() {
		return ex_207;
	}

	public void setEx_207(String ex_207) {
		this.ex_207 = ex_207;
	}

	public String getEx_209() {
		return ex_209;
	}

	public void setEx_209(String ex_209) {
		this.ex_209 = ex_209;
	}

	public String getEx_210() {
		return ex_210;
	}

	public void setEx_210(String ex_210) {
		this.ex_210 = ex_210;
	}

	public String getEx_211() {
		return ex_211;
	}

	public void setEx_211(String ex_211) {
		this.ex_211 = ex_211;
	}

	public String getEx_525() {
		return ex_525;
	}

	public void setEx_525(String ex_525) {
		this.ex_525 = ex_525;
	}

	public String getEx_311() {
		return ex_311;
	}

	public void setEx_311(String ex_311) {
		this.ex_311 = ex_311;
	}

	public String getEx_313() {
		return ex_313;
	}

	public void setEx_313(String ex_313) {
		this.ex_313 = ex_313;
	}

	public String getEx_316() {
		return ex_316;
	}

	public void setEx_316(String ex_316) {
		this.ex_316 = ex_316;
	}

	public String getEx_466() {
		return ex_466;
	}

	public void setEx_466(String ex_466) {
		this.ex_466 = ex_466;
	}

	public String getEx_494() {
		return ex_494;
	}

	public void setEx_494(String ex_494) {
		this.ex_494 = ex_494;
	}

	public String getEx_495() {
		return ex_495;
	}

	public void setEx_495(String ex_495) {
		this.ex_495 = ex_495;
	}

	public String getVal2_201() {
		return val2_201;
	}

	public void setVal2_201(String val2_201) {
		this.val2_201 = val2_201;
	}

	public String getVal2_203() {
		return val2_203;
	}

	public void setVal2_203(String val2_203) {
		this.val2_203 = val2_203;
	}

	public String getVal2_207() {
		return val2_207;
	}

	public void setVal2_207(String val2_207) {
		this.val2_207 = val2_207;
	}

	public String getVal2_209() {
		return val2_209;
	}

	public void setVal2_209(String val2_209) {
		this.val2_209 = val2_209;
	}

	public String getVal2_210() {
		return val2_210;
	}

	public void setVal2_210(String val2_210) {
		this.val2_210 = val2_210;
	}

	public String getVal2_211() {
		return val2_211;
	}

	public void setVal2_211(String val2_211) {
		this.val2_211 = val2_211;
	}

	public String getVal2_525() {
		return val2_525;
	}

	public void setVal2_525(String val2_525) {
		this.val2_525 = val2_525;
	}

	public String getVal2_311() {
		return val2_311;
	}

	public void setVal2_311(String val2_311) {
		this.val2_311 = val2_311;
	}

	public String getVal2_313() {
		return val2_313;
	}

	public void setVal2_313(String val2_313) {
		this.val2_313 = val2_313;
	}

	public String getVal2_316() {
		return val2_316;
	}

	public void setVal2_316(String val2_316) {
		this.val2_316 = val2_316;
	}

	public String getVal2_466() {
		return val2_466;
	}

	public void setVal2_466(String val2_466) {
		this.val2_466 = val2_466;
	}

	public String getVal2_494() {
		return val2_494;
	}

	public void setVal2_494(String val2_494) {
		this.val2_494 = val2_494;
	}

	public String getVal2_495() {
		return val2_495;
	}

	public void setVal2_495(String val2_495) {
		this.val2_495 = val2_495;
	}

	public String getDatatime_201() {
		return datatime_201;
	}

	public void setDatatime_201(String datatime_201) {
		this.datatime_201 = datatime_201;
	}

	public String getDatatime_203() {
		return datatime_203;
	}

	public void setDatatime_203(String datatime_203) {
		this.datatime_203 = datatime_203;
	}

	public String getDatatime_207() {
		return datatime_207;
	}

	public void setDatatime_207(String datatime_207) {
		this.datatime_207 = datatime_207;
	}

	public String getDatatime_209() {
		return datatime_209;
	}

	public void setDatatime_209(String datatime_209) {
		this.datatime_209 = datatime_209;
	}

	public String getDatatime_210() {
		return datatime_210;
	}

	public void setDatatime_210(String datatime_210) {
		this.datatime_210 = datatime_210;
	}

	public String getDatatime_211() {
		return datatime_211;
	}

	public void setDatatime_211(String datatime_211) {
		this.datatime_211 = datatime_211;
	}

	public String getDatatime_525() {
		return datatime_525;
	}

	public void setDatatime_525(String datatime_525) {
		this.datatime_525 = datatime_525;
	}

	public String getDatatime_311() {
		return datatime_311;
	}

	public void setDatatime_311(String datatime_311) {
		this.datatime_311 = datatime_311;
	}

	public String getDatatime_313() {
		return datatime_313;
	}

	public void setDatatime_313(String datatime_313) {
		this.datatime_313 = datatime_313;
	}

	public String getDatatime_316() {
		return datatime_316;
	}

	public void setDatatime_316(String datatime_316) {
		this.datatime_316 = datatime_316;
	}

	public String getDatatime_466() {
		return datatime_466;
	}

	public void setDatatime_466(String datatime_466) {
		this.datatime_466 = datatime_466;
	}

	public String getDatatime_494() {
		return datatime_494;
	}

	public void setDatatime_494(String datatime_494) {
		this.datatime_494 = datatime_494;
	}

	public String getDatatime_495() {
		return datatime_495;
	}

	public void setDatatime_495(String datatime_495) {
		this.datatime_495 = datatime_495;
	}

	@Override
	public String toString() {
		return "Record [sn=" + sn + ", dateTime=" + dateTime + ", stcode=" + stcode + ", stname=" + stname
				+ ", enterpriseName=" + enterpriseName + ", subID=" + subID + ", subName=" + subName + ", status="
				+ status + ", rownum=" + rownum + ", pid_201=" + pid_201 + ", pid_203=" + pid_203 + ", pid_207="
				+ pid_207 + ", pid_209=" + pid_209 + ", pid_210=" + pid_210 + ", pid_211=" + pid_211 + ", pid_525="
				+ pid_525 + ", pid_311=" + pid_311 + ", pid_313=" + pid_313 + ", pid_316=" + pid_316 + ", pid_466="
				+ pid_466 + ", pid_494=" + pid_494 + ", pid_495=" + pid_495 + ", val_201=" + val_201 + ", val_203="
				+ val_203 + ", val_207=" + val_207 + ", val_209=" + val_209 + ", val_210=" + val_210 + ", val_211="
				+ val_211 + ", val_525=" + val_525 + ", val_311=" + val_311 + ", val_313=" + val_313 + ", val_316="
				+ val_316 + ", val_466=" + val_466 + ", val_494=" + val_494 + ", val_495=" + val_495 + ", cvt_201="
				+ cvt_201 + ", cvt_203=" + cvt_203 + ", cvt_207=" + cvt_207 + ", cvt_209=" + cvt_209 + ", cvt_210="
				+ cvt_210 + ", cvt_211=" + cvt_211 + ", cvt_525=" + cvt_525 + ", cvt_311=" + cvt_311 + ", cvt_313="
				+ cvt_313 + ", cvt_316=" + cvt_316 + ", cvt_466=" + cvt_466 + ", cvt_494=" + cvt_494 + ", cvt_495="
				+ cvt_495 + ", stand_201=" + stand_201 + ", stand_203=" + stand_203 + ", stand_207=" + stand_207
				+ ", stand_209=" + stand_209 + ", stand_210=" + stand_210 + ", stand_211=" + stand_211 + ", stand_525="
				+ stand_525 + ", stand_311=" + stand_311 + ", stand_313=" + stand_313 + ", stand_316=" + stand_316
				+ ", stand_466=" + stand_466 + ", stand_494=" + stand_494 + ", stand_495=" + stand_495 + ", cbbs_201="
				+ cbbs_201 + ", cbbs_203=" + cbbs_203 + ", cbbs_207=" + cbbs_207 + ", cbbs_209=" + cbbs_209
				+ ", cbbs_210=" + cbbs_210 + ", cbbs_211=" + cbbs_211 + ", cbbs_525=" + cbbs_525 + ", cbbs_311="
				+ cbbs_311 + ", cbbs_313=" + cbbs_313 + ", cbbs_316=" + cbbs_316 + ", cbbs_466=" + cbbs_466
				+ ", cbbs_494=" + cbbs_494 + ", cbbs_495=" + cbbs_495 + ", low_201=" + low_201 + ", low_203=" + low_203
				+ ", low_207=" + low_207 + ", low_209=" + low_209 + ", low_210=" + low_210 + ", low_211=" + low_211
				+ ", low_525=" + low_525 + ", low_311=" + low_311 + ", low_313=" + low_313 + ", low_316=" + low_316
				+ ", low_466=" + low_466 + ", low_494=" + low_494 + ", low_495=" + low_495 + ", high_201=" + high_201
				+ ", high_203=" + high_203 + ", high_207=" + high_207 + ", high_209=" + high_209 + ", high_210="
				+ high_210 + ", high_211=" + high_211 + ", high_525=" + high_525 + ", high_311=" + high_311
				+ ", high_313=" + high_313 + ", high_316=" + high_316 + ", high_466=" + high_466 + ", high_494="
				+ high_494 + ", high_495=" + high_495 + ", state_201=" + state_201 + ", state_203=" + state_203
				+ ", state_207=" + state_207 + ", state_209=" + state_209 + ", state_210=" + state_210 + ", state_211="
				+ state_211 + ", state_525=" + state_525 + ", state_311=" + state_311 + ", state_313=" + state_313
				+ ", state_316=" + state_316 + ", state_466=" + state_466 + ", state_494=" + state_494 + ", state_495="
				+ state_495 + ", ex_201=" + ex_201 + ", ex_203=" + ex_203 + ", ex_207=" + ex_207 + ", ex_209=" + ex_209
				+ ", ex_210=" + ex_210 + ", ex_211=" + ex_211 + ", ex_525=" + ex_525 + ", ex_311=" + ex_311
				+ ", ex_313=" + ex_313 + ", ex_316=" + ex_316 + ", ex_466=" + ex_466 + ", ex_494=" + ex_494
				+ ", ex_495=" + ex_495 + ", val2_201=" + val2_201 + ", val2_203=" + val2_203 + ", val2_207=" + val2_207
				+ ", val2_209=" + val2_209 + ", val2_210=" + val2_210 + ", val2_211=" + val2_211 + ", val2_525="
				+ val2_525 + ", val2_311=" + val2_311 + ", val2_313=" + val2_313 + ", val2_316=" + val2_316
				+ ", val2_466=" + val2_466 + ", val2_494=" + val2_494 + ", val2_495=" + val2_495 + ", datatime_201="
				+ datatime_201 + ", datatime_203=" + datatime_203 + ", datatime_207=" + datatime_207 + ", datatime_209="
				+ datatime_209 + ", datatime_210=" + datatime_210 + ", datatime_211=" + datatime_211 + ", datatime_525="
				+ datatime_525 + ", datatime_311=" + datatime_311 + ", datatime_313=" + datatime_313 + ", datatime_316="
				+ datatime_316 + ", datatime_466=" + datatime_466 + ", datatime_494=" + datatime_494 + ", datatime_495="
				+ datatime_495 + "]";
	}

}
