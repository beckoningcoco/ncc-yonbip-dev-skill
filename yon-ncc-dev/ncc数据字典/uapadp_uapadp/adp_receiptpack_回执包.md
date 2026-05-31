# |<<

**回执包 (adp_receiptpack / nc.vo.uap.distribution.restrans.ReceiptPackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/18.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | receiptid | 编号 | receiptid | char(20) | √ | 主键 (UFID) |
| 2 | receiptcode | 回执编码 | receiptcode | varchar(50) |  | 字符串 (String) |
| 3 | procresult | 处理结果 | procresult | int |  | 处理结果 (ReceiptProcResult) |  | -1=接收完成; |