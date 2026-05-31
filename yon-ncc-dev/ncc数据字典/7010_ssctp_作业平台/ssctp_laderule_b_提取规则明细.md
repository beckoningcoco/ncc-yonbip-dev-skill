# |<<

**提取规则明细 (ssctp_laderule_b / nc.vo.ssctp.sscbd.laderule.SSCLadeRuleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5653.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_laderule_b | 主键 | pk_laderule_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscunit | 所属共享中心 | pk_sscunit | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | refpk | 引用PK | refpk | varchar(20) |  | 共享作业组 (ssctp_workinggroup) |
| 5 | seqno | 序号 | seqno | int |  | 整数 (Integer) |