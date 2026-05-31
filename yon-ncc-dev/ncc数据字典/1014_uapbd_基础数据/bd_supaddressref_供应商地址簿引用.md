# |<<

**供应商地址簿引用 (bd_supaddressref / nc.vo.bd.supplier.supaddress.SupAddressRefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/972.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_address | 地址簿主键 | pk_address | varchar(20) | √ | 地址簿 (address) |
| 2 | reftablename | 引用表名 | reftablename | varchar(50) | √ | 字符串 (String) |
| 3 | reffieldname | 引用字段名 | reffieldname | varchar(50) | √ | 字符串 (String) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_supplier | 供应商主键 | pk_supplier | varchar(20) | √ | 供应商基本信息 (supplier) |
| 7 | pk_supaddress | 供应商发货地址主键 | pk_supaddress | varchar(20) |  | 供应商发货地址 (supaddress) |
| 8 | isupdated | 是否更新引用 | isupdated | char(1) |  | 布尔类型 (UFBoolean) |