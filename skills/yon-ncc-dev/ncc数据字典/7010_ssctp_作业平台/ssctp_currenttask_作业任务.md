# |<<

**作业任务 (ssctp_currenttask / nc.vo.ssctp.sscbd.SSCCurrentTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5642.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currenttask | 唯一标识 | pk_currenttask | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscunit | 共享中心 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 3 | pk_bill | 报账单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 4 | busiid | 单据主键 | busiid | varchar(20) |  | 字符串 (String) |
| 5 | billno | 单据编号 | billno | varchar(200) |  | 字符串 (String) |
| 6 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 交易类型 (transtype) |
| 7 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 交易类型 (transtype) |
| 8 | barcode | 条形码 | barcode | varchar(200) |  | 字符串 (String) |
| 9 | pk_sscgroup | 共享作业组 | pk_sscgroup | varchar(20) |  | 共享作业组 (ssctp_workinggroup) |
| 10 | pk_sscnode | 共享环节 | pk_sscnode | varchar(20) |  | 作业任务定义 (ssctp_node) |
| 11 | pk_sscuser | 作业人员 | pk_sscuser | varchar(20) |  | 用户 (user) |
| 12 | flownode | 流程环节 | flownode | varchar(20) |  | 流程节点 (flownode) |  | commit=提交; |