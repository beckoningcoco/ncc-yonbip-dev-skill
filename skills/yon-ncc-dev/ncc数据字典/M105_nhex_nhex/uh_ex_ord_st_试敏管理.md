# |<<

**试敏管理 (uh_ex_ord_st / com.yonyou.yh.nhis.ex.ordst.UhExOrdStVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6104.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_strec | 主键 | pk_strec | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_pv | 就诊 | pk_pv | varchar(20) |  | 患者就诊 (pvbanner) |
| 6 | pk_ord | 医嘱 | pk_ord | varchar(50) |  | 字符串 (String) |
| 7 | pk_dept_st | 执行科室 | pk_dept_st | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_psn_st | 操作人 | pk_psn_st | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | name_psn_st | 操作人名称 | name_psn_st | varchar(50) |  | 字符串 (String) |
| 10 | date_st | 操作日期 | date_st | char(19) |  | 日期时间 (UFDateTime) |
| 11 | eu_result | 皮试阳性 | eu_result | int |  | 整数 (Integer) |
| 12 | flag_chk | 审核标志 | flag_chk | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | note | 备注 | note | varchar(2000) |  | 字符串 (String) |