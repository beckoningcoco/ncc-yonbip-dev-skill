# |<<

**成本凭证单 (cca_costvoucher / nc.vo.cca.costvoucher.CostVoucherVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1275.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costvoucher | 主键 | pk_costvoucher | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型主键 | pk_billtype | char(20) |  | 主键 (UFID) |
| 3 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 6 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 8 | vbillno | 凭证单号 | vbillno | varchar(50) |  | 字符串 (String) |
| 9 | vbillstatus | 凭证单状态 | vbillstatus | int |  | 凭证单状态 (VoucherStatusEnum) |  | -1=保存态; |