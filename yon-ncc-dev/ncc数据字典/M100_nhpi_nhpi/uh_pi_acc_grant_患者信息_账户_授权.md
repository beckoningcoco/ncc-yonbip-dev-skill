# |<<

**患者信息_账户_授权 (uh_pi_acc_grant / com.yonyou.yh.nhis.pi.patiaccgrant.vo.PatiAccGrantVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6171.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accgrant | 账户授权主键 | pk_accgrant | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_patiacc | 患者账户 | pk_patiacc | varchar(20) |  | 患者账户 (patiacc) |
| 6 | pk_pati_grant | 患者_被授权 | pk_pati_grant | varchar(20) |  | 患者基本信息 (pati) |
| 7 | pk_psn_input | 录入人 | pk_psn_input | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | name_psn_input | 录入人名称 | name_psn_input | varchar(50) |  | 字符串 (String) |
| 9 | date_entry | 录入日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 10 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |