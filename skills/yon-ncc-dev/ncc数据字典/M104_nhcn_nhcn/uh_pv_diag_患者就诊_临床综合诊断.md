# |<<

**患者就诊_临床综合诊断 (uh_pv_diag / com.yonyou.yh.nhis.cn.ord.v2.vo.CNPvDiagVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6221.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvdiag | 患者就诊诊断主键 | pk_pvdiag | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_pv | 患者就诊 | pk_pv | varchar(50) |  | 字符串 (String) |
| 5 | sortno | 诊断序号 | sortno | int |  | 整数 (Integer) |
| 6 | dt_diagtype | 诊断类型 | dt_diagtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_diag | 诊断 | pk_diag | varchar(50) |  | 字符串 (String) |
| 8 | desc_diag | 诊断描述 | desc_diag | varchar(256) |  | 字符串 (String) |
| 9 | flag_maj | 主要诊断标志 | flag_maj | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | flag_susp | 疑似诊断标志 | flag_susp | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | flag_infect | 传染病标志 | flag_infect | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | date_diag | 诊断日期 | date_diag | char(19) |  | 日期时间 (UFDateTime) |
| 13 | pk_psn_phy | 诊断医生 | pk_psn_phy | varchar(20) |  | 主键 (UFID) |
| 14 | flag_final | 确诊标志 | flag_final | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | flag_cure | 治愈标志 | flag_cure | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | dt_emrfpdiagcase | 患者病情 | dt_emrfpdiagcase | varchar(50) |  | 字符串 (String) |
| 17 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 18 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 20 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |