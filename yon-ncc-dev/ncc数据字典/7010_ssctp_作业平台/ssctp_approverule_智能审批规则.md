# |<<

**智能审批规则 (ssctp_approverule / nc.vo.ssctp.sscapv.approverule.SSCApproveRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5635.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_approverule | 主键 | pk_approverule | char(20) | √ | 主键 (UFID) |
| 2 | code | 规则编码 | code | varchar(100) | √ | 字符串 (String) |
| 3 | name | 规则名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_sscunit | 共享中心 | pk_sscunit | varchar(20) | √ | 共享服务中心 (sscunit) |
| 5 | formula | 规则内容 | formula | varchar(1000) | √ | 字符串 (String) |
| 6 | enablestate | 是否启用 | enablestate | int | √ | 是否启用 (enablestate) |  | 1=启用; |