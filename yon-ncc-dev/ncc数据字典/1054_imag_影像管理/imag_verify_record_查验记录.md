# |<<

**查验记录 (imag_verify_record / nc.vo.imag.verify.VerifyRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_record | 查验记录主键 | pk_record | varchar(20) | √ | 字符串 (String) |
| 2 | userid | 操作人ID | userid | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 组织机构PK | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | orgcode | 组织机构编码 | orgcode | varchar(40) |  | 字符串 (String) |
| 5 | nsrsbh | 纳税人识别号 | nsrsbh | varchar(50) |  | 字符串 (String) |
| 6 | factorycode | 厂商编码 | factorycode | varchar(50) |  | 字符串 (String) |
| 7 | fpdm | 发票代码 | fpdm | varchar(50) |  | 字符串 (String) |
| 8 | fphm | 发票号码 | fphm | varchar(50) |  | 字符串 (String) |
| 9 | kprq | 开票日期 | kprq | varchar(50) |  | 字符串 (String) |
| 10 | hjje | 合计金额 | hjje | varchar(50) |  | 字符串 (String) |
| 11 | jym | 校验码 | jym | varchar(50) |  | 字符串 (String) |
| 12 | jshj | 价税合计 | jshj | varchar(50) |  | 字符串 (String) |
| 13 | billid | 单据pk | billid | varchar(50) |  | 字符串 (String) |
| 14 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 15 | transitype | 交易类型 | transitype | varchar(50) |  | 字符串 (String) |
| 16 | filename | 查验文件名称 | filename | varchar(300) |  | 字符串 (String) |
| 17 | savetoken | 本次查验唯一标识 | savetoken | varchar(64) |  | 字符串 (String) |
| 18 | tokenstate | token状态 | tokenstate | int |  | 整数 (Integer) |
| 19 | code | 查验结果表示 | code | varchar(50) |  | 字符串 (String) |
| 20 | msg | 查验异常信息 | msg | varchar(1000) |  | 字符串 (String) |
| 21 | invoice | 查验发票信息 | invoice | image |  | BLOB (BLOB) |
| 22 | type | 发票类型 | type | int |  | 整数 (Integer) |