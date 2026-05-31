# |<<

**就诊类型结算发票 (bd_uh_invoice / com.yonyou.yh.nhis.bd.invoice.vo.InvoiceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1048.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice | 发票主键 | pk_invoice | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 5 | itemname | 项目名称 | itemname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | itemcode | 项目编码 | itemcode | varchar(50) |  | 字符串 (String) |
| 7 | creator | 创建者 | creator | varchar(20) |  | 用户 (user) |
| 8 | modifier | 修改者 | modifier | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |