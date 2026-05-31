# |<<

**授信明细版本 (ccc_protocoldetail_v / nc.vo.ccc.bankprotocol.ProtocolDetailVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1317.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本pk | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_detail | 主键 | pk_detail | char(20) | √ | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 授信使用单位 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | credittype | 授信类别 | credittype | varchar(20) |  | 授信类别 (tmpub_cctype) |
| 7 | controltype | 控制方式 | controltype | varchar(20) |  | 控制方式 (ControlMethodEnum) |  | PROMPT=提示; |