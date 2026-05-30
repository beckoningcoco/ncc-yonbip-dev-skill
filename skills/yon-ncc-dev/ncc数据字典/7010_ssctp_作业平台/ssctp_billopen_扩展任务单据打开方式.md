# |<<

**扩展任务单据打开方式 (ssctp_billopen / nc.vo.ssctp.sscext.BillOpenVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5637.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billopen | 唯一标识 | pk_billopen | char(20) | √ | 主键 (UFID) |
| 2 | pk_tasktype | 任务类型 | pk_tasktype | varchar(20) |  | 任务类型 (tasktype) |
| 3 | type | 打开方式 | type | int |  | 打开方式 (ssctp_billopentype_enum) |  | 1=标准交易类型打开方式; |