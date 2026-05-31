# |<<

**客户收货地址 (bd_custaddress / nc.vo.bd.cust.custaddress.CustaddressVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/431.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_address | 收货地址 | pk_address | varchar(20) | √ | 地址簿 (address) |
| 2 | pk_customer | 客户主键 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 5 | pk_linkman | 联系人 | pk_linkman | varchar(20) |  | 联系人 (linkman) |
| 6 | isdefault | 是否默认 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_areacl | 所属地区 | pk_areacl | varchar(20) |  | 地区分类 (areaclass) |
| 8 | pk_addressdoc | 所属地点 | pk_addressdoc | varchar(20) |  | 地点档案 (addressdoc) |
| 9 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |