# |<<

**患者就诊_急诊属性 (uh_pv_er / com.yonyou.yh.nhis.pv.adt.vo.PVEmergVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6223.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pv_er | 患者就诊急诊属性主键 | pk_pv_er | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pati | 患者 | pk_pati | varchar(50) |  | 字符串 (String) |
| 5 | pk_srvtype | 服务类型_诊疗类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 6 | dt_srvtype | 服务类型_诊疗类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 7 | name_srv | 服务名称_诊疗 | name_srv | varchar(50) |  | 字符串 (String) |
| 8 | pk_dateslot | 日期分组 | pk_dateslot | varchar(20) |  | 排班_日期分组 (dateslot) |
| 9 | name_dateslot | 日期分组名称 | name_dateslot | varchar(50) |  | 字符串 (String) |
| 10 | date_valid_begin | 有效期限_开始 | date_valid_begin | char(19) |  | 日期时间 (UFDateTime) |
| 11 | date_valid_end | 有效期限_结束 | date_valid_end | char(19) |  | 日期时间 (UFDateTime) |
| 12 | ticketno | 就诊排队号 | ticketno | int |  | 整数 (Integer) |
| 13 | pk_sch | 对应排班 | pk_sch | varchar(20) |  | 排班预约_排班 (SchVO) |
| 14 | pk_cg | 对应记费 | pk_cg | varchar(50) |  | 字符串 (String) |
| 15 | flag_st | 已结算标志_挂号 | flag_st | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | pk_st | 对应结算 | pk_st | varchar(50) |  | 字符串 (String) |
| 17 | flag_first | 初诊标志 | flag_first | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pk_pvopappt | 对应预约 | pk_pvopappt | varchar(50) |  | 字符串 (String) |
| 19 | pk_res | 排班资源 | pk_res | varchar(20) |  | 排班资源 (SchResVO) |
| 20 | pk_psn_regist | 挂号医生 | pk_psn_regist | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | name_psn_regist | 挂号医生名称 | name_psn_regist | varchar(50) |  | 字符串 (String) |
| 22 | date_morbidity | 发病日期 | date_morbidity | char(19) |  | 日期时间 (UFDateTime) |
| 23 | name_patriarch | 家长姓名 | name_patriarch | varchar(50) |  | 字符串 (String) |
| 24 | pk_pv | 就诊主键 | pk_pv | varchar(50) |  | 字符串 (String) |
| 25 | pk_schsrv | 服务_诊疗 | pk_schsrv | varchar(50) |  | 字符串 (String) |