# |<<

**核对结果 (ssctp_comparison_result / nc.vo.ssctp.ssccheck.ComparisonResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5641.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_comparison_result | 主键 | pk_comparison_result | char(20) | √ | 主键 (UFID) |
| 2 | billid | 单据主键 | billid | varchar(50) |  | 字符串 (String) |
| 3 | pk_task | 共享流程动作 | pk_task | varchar(20) |  | 环节任务 (ssctp_task) |
| 4 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 交易类型 (transtype) |
| 5 | pk_sscunit | 共享中心 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 6 | pk_flowpath | 操作记录 | pk_flowpath | varchar(20) |  | 共享任务流程历史 (ssctp_flowpath) |
| 7 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |