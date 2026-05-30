# |<<

**供应商发货地址 (bd_supaddress / nc.vo.bd.supplier.supaddress.SupAddressVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/971.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_address | 发货地址 | pk_address | varchar(20) | √ | 地址簿 (address) |
| 2 | pk_linkman | 联系人 | pk_linkman | varchar(20) |  | 联系人 (linkman) |
| 3 | isdefault | 是否默认地址 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | pk_areacl | 所属地区 | pk_areacl | varchar(20) |  | 地区分类 (areaclass) |
| 5 | pk_addressdoc | 所属地点 | pk_addressdoc | varchar(20) |  | 地点档案 (addressdoc) |
| 6 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 9 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |