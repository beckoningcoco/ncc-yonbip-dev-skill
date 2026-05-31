# |<<

**传染病上报 (uh_pv_infect_report / com.yonyou.yh.nhis.pv.infect.vo.InfectReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6230.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_report | 传染病上报主键 | pk_report | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | no_card | 卡片编号 | no_card | varchar(50) |  | 字符串 (String) |
| 5 | pk_pv | 患者就诊主键 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 6 | name_patr | 患者家长姓名 | name_patr | varchar(200) |  | 字符串 (String) |
| 7 | id_number | 有效证件号码 | id_number | varchar(50) |  | 字符串 (String) |
| 8 | sex | 性别 | sex | varchar(50) |  | 性别 (fsexflag) |  | 1=男; |