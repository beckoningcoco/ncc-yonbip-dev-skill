# |<<

**凭证生成 (scaba_virtualvoucher / nc.vo.scaba.voucher.VoucherVirtualVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5095.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_virvoucher | 主键（消耗单PK） | pk_virvoucher | char(20) | √ | 主键 (UFID) |
| 2 | dbusinessdate | 业务日期 | dbusinessdate | char(19) |  | 日期 (UFDate) |
| 3 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 4 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 7 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 8 | pk_org_co | 业务单元 | pk_org_co | varchar(20) |  | 组织 (org) |
| 9 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 10 | isourcetype | 单据类型 | isourcetype | int |  | 来源类型(成本) (CMSourceTypeEnum) |  | 1=自制; |