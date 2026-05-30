# |<<

**不满意原因 (sscsfm_unsatisfied_reason / nc.vo.sscsfm.sfmpub.UnsatisfiedReasonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5628.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reason | 主键 | pk_reason | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscunit | 共享中心 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 3 | pk_dimension | 所属维度 | pk_dimension | varchar(20) |  | 评价维度 (sscsfm_evaluation_dimension) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | remark | 备注 | remark | varchar(200) |  | 备注 (Memo) |
| 7 | enablestate | 启用状态 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |