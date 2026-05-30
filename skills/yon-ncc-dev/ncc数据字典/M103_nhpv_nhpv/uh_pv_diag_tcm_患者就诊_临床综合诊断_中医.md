# |<<

**患者就诊_临床综合诊断_中医 (uh_pv_diag_tcm / com.yonyou.yh.nhis.pv.pvdiagnosistcm.vo.PvDiagNosistcmVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6222.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvdiagtcm | 中医诊断主键 | pk_pvdiagtcm | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_diagtype_tcm | 诊断类型 | pk_diagtype_tcm | varchar(20) |  | 诊断类型_中医(自定义档案) (Defdoc-060006) |
| 7 | dt_diagtype_tcm | 诊断类型编码 | dt_diagtype_tcm | varchar(50) |  | 字符串 (String) |
| 8 | code | 诊断编码 | code | varchar(30) |  | 字符串 (String) |
| 9 | name | 诊断名称 | name | varchar(50) |  | 多语文本 (MultiLangText) |
| 10 | pk_diag | 标准诊断 | pk_diag | varchar(20) |  | 标准诊断编码 (stddiag) |
| 11 | describe | 诊断描述 | describe | varchar(256) |  | 字符串 (String) |
| 12 | flag_maj | 主要诊断标志 | flag_maj | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | date_diag | 诊断日期 | date_diag | char(19) |  | 日期 (UFDate) |
| 14 | pk_psn_phy | 诊断医生 | pk_psn_phy | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | flag_cure | 治愈标志 | flag_cure | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |