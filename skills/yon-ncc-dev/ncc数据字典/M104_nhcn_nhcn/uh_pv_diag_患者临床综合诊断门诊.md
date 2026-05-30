# |<<

**患者临床综合诊断门诊 (uh_pv_diag / com.yonyou.yh.nhis.cn.ord.vo.OpPvDiagVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6220.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvdiag | 患者就诊诊断主键 | pk_pvdiag | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 5 | sortno | 诊断序号 | sortno | int |  | 整数 (Integer) |
| 6 | dt_diagtype | 诊断类型编码 | dt_diagtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_diagtype | 诊断类型 | pk_diagtype | varchar(20) |  | 诊断类型(自定义档案) (Defdoc-060005) |
| 8 | pk_diag | 标准诊断 | pk_diag | varchar(20) |  | 标准诊断编码 (stddiag) |
| 9 | desc_diag | 诊断描述 | desc_diag | varchar(256) |  | 字符串 (String) |
| 10 | flag_maj | 主要诊断标志 | flag_maj | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | date_diag | 诊断日期 | date_diag | char(19) |  | 日期时间 (UFDateTime) |
| 12 | pk_psn_phy | 诊断医生 | pk_psn_phy | varchar(20) |  | 用户 (user) |
| 13 | name_psn_phy | 诊断医生名称 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 14 | flag_final | 确诊标志 | flag_final | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | flag_cure | 治愈标志 | flag_cure | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | flag_susp | 疑似诊断标志 | flag_susp | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | flag_infect | 传染病标志 | flag_infect | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | dt_emrfpdiagcase | 出院诊断病情 | dt_emrfpdiagcase | varchar(50) |  | 字符串 (String) |
| 19 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 22 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |