# |<<

**任务提取规则 (ssctp_laderule / nc.vo.ssctp.sscbd.laderule.SSCLadeRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5652.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_laderule | 主键 | pk_laderule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_sscunit | 所属共享中心 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 4 | seqno | 序号 | seqno | int |  | 整数 (Integer) |
| 5 | code | 编码 | code | varchar(100) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | remark | 备注 | remark | varchar(50) |  | 字符串 (String) |
| 8 | ladetype | 提取方式 | ladetype | int |  | 提取方式 (SSCLadeTypeEnum) | 10 | 0=不限制提取; |