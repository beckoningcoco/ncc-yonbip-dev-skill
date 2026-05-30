# |<<

**物资需求数据接收 (hstf_reqdatareceive / nc.vo.hstf.reqdatareceive.ReqDataReceiveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2785.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reqdatareceive | ID | pk_reqdatareceive | char(20) | √ | 主键 (UFID) |
| 2 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 3 | srcsyscode | 对接系统编码 | srcsyscode | varchar(50) |  | 字符串 (String) |
| 4 | srcsysname | 对接系统名称 | srcsysname | varchar(50) |  | 字符串 (String) |
| 5 | address | 对方系统地址 | address | varchar(50) |  | 字符串 (String) |
| 6 | account | 对方系统账户 | account | varchar(50) |  | 字符串 (String) |
| 7 | pk_srcoutbill | 对接系统申请单主键 | pk_srcoutbill | varchar(50) |  | 字符串 (String) |
| 8 | srcbillcode | 对接系统申请单号 | srcbillcode | varchar(50) |  | 字符串 (String) |
| 9 | srcorgcode | 对接系统院区编码 | srcorgcode | varchar(50) |  | 字符串 (String) |
| 10 | srcorgname | 对接系统院区名称 | srcorgname | varchar(50) |  | 字符串 (String) |
| 11 | srcdeptcode | 对接系统科室编码 | srcdeptcode | varchar(50) |  | 字符串 (String) |
| 12 | srcdeptname | 对接系统科室名称 | srcdeptname | varchar(50) |  | 字符串 (String) |
| 13 | srcpsncode | 对接系统人员编码 | srcpsncode | varchar(50) |  | 字符串 (String) |
| 14 | srcpsnname | 对接系统人员名称 | srcpsnname | varchar(50) |  | 字符串 (String) |
| 15 | srcoutdeptcode | 对接系统领料科室编码 | srcoutdeptcode | varchar(50) |  | 字符串 (String) |
| 16 | srcoutdeptname | 对接系统领料科室名称 | srcoutdeptname | varchar(50) |  | 字符串 (String) |
| 17 | srcoutpsncode | 对接系统领料员编码 | srcoutpsncode | varchar(50) |  | 字符串 (String) |
| 18 | srcoutpsnname | 对接系统领料员名称 | srcoutpsnname | varchar(50) |  | 字符串 (String) |
| 19 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 20 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 21 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 22 | vbillcode | 申请单号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 23 | vbilldate | 申请日期 | vbilldate | varchar(50) |  | 字符串 (String) |
| 24 | dbilltype | 申请单据类型 | dbilltype | int |  | 申请单据类型 (reqbilltype) |  | 0=物资需求申请; |