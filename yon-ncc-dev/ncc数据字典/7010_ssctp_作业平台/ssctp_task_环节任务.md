# |<<

**环节任务 (ssctp_task / nc.vo.ssctp.sscbd.SSCTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5664.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task | 唯一标识 | pk_task | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscunit | 共享中心 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 3 | pk_bill | 报账单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 4 | busiid | 单据主键 | busiid | varchar(20) |  | 字符串 (String) |
| 5 | billno | 单据编号 | billno | varchar(200) |  | 字符串 (String) |
| 6 | billdate | 制单日期 | billdate | char(19) |  | 日期 (UFDate) |
| 7 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 交易类型 (transtype) |
| 9 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 交易类型 (transtype) |
| 10 | barcode | 条码号 | barcode | varchar(200) |  | 字符串 (String) |
| 11 | pk_sscgroup | 共享作业组 | pk_sscgroup | varchar(20) |  | 共享作业组 (ssctp_workinggroup) |
| 12 | pk_sscnode | 共享环节 | pk_sscnode | varchar(20) |  | 作业任务定义 (ssctp_node) |
| 13 | pk_sscuser | 作业人员 | pk_sscuser | varchar(20) |  | 用户 (user) |
| 14 | flownode | 流程环节 | flownode | varchar(20) |  | 流程节点 (flownode) |  | commit=提交; |