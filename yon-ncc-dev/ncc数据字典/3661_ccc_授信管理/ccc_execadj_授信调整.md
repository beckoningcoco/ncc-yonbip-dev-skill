# |<<

**授信调整 (ccc_execadj / nc.vo.ccc.execadj.ExecAdjVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1312.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_execadj | 调整单主键 | pk_execadj | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | pk_olccurr | 组织本位币 | pk_olccurr | varchar(20) |  | 币种 (currtype) |
| 8 | remark | 备注 | remark | varchar(181) |  | 字符串 (String) |
| 9 | pk_protocol | 授信协议 | pk_protocol | varchar(20) |  | 银行授信协议 (bankprotocol) |
| 10 | protocoltype | 协议类型 | protocoltype | int |  | 协议类型 (ProtocolTypeEnum) |  | 1=企业授信; |