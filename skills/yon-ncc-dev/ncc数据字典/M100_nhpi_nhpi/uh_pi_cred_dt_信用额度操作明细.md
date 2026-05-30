# |<<

**信用额度操作明细 (uh_pi_cred_dt / com.yonyou.yh.nhis.pi.patiaccountqry.vo.PaticreddtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6180.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paticreddt | 患者信用操作主键 | pk_paticreddt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者主键 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | eu_credtype | 操作类型 | eu_credtype | int |  | 操作类型 (CredTypeEnum) |  | 0=信用度额度维护; |