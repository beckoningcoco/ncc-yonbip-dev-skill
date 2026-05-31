# |<<

**银行授信协议 (ccc_bankprotocol / nc.vo.ccc.bankprotocol.ProtocolVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1309.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_protocol | 主键 | pk_protocol | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | controlmethod | 控制方式 | controlmethod | varchar(20) |  | 控制方式 (ControlMethodEnum) |  | PROMPT=提示; |