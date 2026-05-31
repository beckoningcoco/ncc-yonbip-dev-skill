# |<<

**患者账户 (uh_pi_acc / com.yonyou.yh.nhis.pi.patiaccountqry.vo.PatiaccVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6167.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patiacc | 患者账户主键 | pk_patiacc | char(20) | √ | 主键 (UFID) |
| 2 | pk_pati | 患者主键 | pk_pati | varchar(20) | √ | 患者基本信息 (pati) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | amt_cred | 信用度 | amt_cred | decimal(14, 2) |  | 数值 (UFDouble) |
| 6 | amt_cred_lock | 信用度_已授权 | amt_cred_lock | decimal(14, 2) |  | 数值 (UFDouble) |
| 7 | eu_cred_status | 信用度状态 | eu_cred_status | int |  | 信用度状态 (CredStatusEnum) |  | 0=正常; |