# |<<

**收函登记 (bgm_receiveregister / nc.vo.bgm.receive.receiveregister.ReceiveRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1180.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiveregister | 收函登记主键 | pk_receiveregister | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | busistatus | 单据状态 | busistatus | int |  | 单据状态 (BusistatusEnum) |  | 1=待提交; |