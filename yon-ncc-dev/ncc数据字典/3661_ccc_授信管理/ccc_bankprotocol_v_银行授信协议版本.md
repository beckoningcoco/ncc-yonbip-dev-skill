# |<<

**银行授信协议版本 (ccc_bankprotocol_v / nc.vo.ccc.bankprotocol.ProtocolVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1311.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本PK | pk_version | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_protocol | 协议主键 | pk_protocol | varchar(50) | √ | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | controlmethod | 控制方式 | controlmethod | varchar(20) |  | 控制方式 (ControlMethodEnum) |  | PROMPT=提示; |