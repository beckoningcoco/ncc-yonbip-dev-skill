# |<<

**自定义转账定义主体 (gl_transfer / nc.vo.gl.transfer.TransferdefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2487.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transfer | 转账定义主体标识 | pk_transfer | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 4 | note | 转账说明 | note | varchar(1000) |  | 字符串 (String) |
| 5 | billnum | 附单据 | billnum | int |  | 整数 (Integer) |
| 6 | transfertype | 转账类型 | transfertype | varchar(50) |  | 字符串 (String) |
| 7 | pk_corp | 公司编码 | pk_corp | varchar(50) |  | 字符串 (String) |
| 8 | pk_operator | 操作员 | pk_operator | varchar(20) |  | 用户 (user) |
| 9 | transferno | 编号 | transferno | varchar(28) |  | 字符串 (String) |
| 10 | transtimelimit | 转账时间 | transtimelimit | varchar(50) |  | 转账时间 (transftime) |  | 1=月; |