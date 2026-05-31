# |<<

**票据托管 (fbm_storage / nc.vo.fbm.storage.StorageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2159.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_storage | 主键 | pk_storage | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 3 | inputperson | 托管办理人 | inputperson | varchar(20) |  | 人员基本信息 (psndoc) |
| 4 | inputdate | 托管日期 | inputdate | char(19) |  | 日期 (UFDate) |
| 5 | outputperson | 领用办理人 | outputperson | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | outputdate | 领用日期 | outputdate | char(19) |  | 日期 (UFDate) |
| 7 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | vbillstatus | 单据状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |