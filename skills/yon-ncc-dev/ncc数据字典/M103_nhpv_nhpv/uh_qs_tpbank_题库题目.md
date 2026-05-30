# |<<

**题库题目 (uh_qs_tpbank / com.yonyou.yh.nhis.pv.qs.vo.TpbankVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6249.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topic | 主键 | pk_topic | char(20) | √ | 主键 (UFID) |
| 2 | pk_corp | 所属公司 | pk_corp | char(20) |  | 主键 (UFID) |
| 3 | pk_topic_type | 题目分类 | pk_topic_type | char(20) |  | 主键 (UFID) |
| 4 | topic_code | 题目编码 | topic_code | varchar(40) |  | 字符串 (String) |
| 5 | topic_desc | 题目描述 | topic_desc | varchar(500) |  | 字符串 (String) |
| 6 | topic_style | 题型 | topic_style | int |  | 整数 (Integer) |
| 7 | scale | 精度 | scale | int |  | 整数 (Integer) |
| 8 | max_value | 最大值 | max_value | decimal(12, 4) |  | 数值 (UFDouble) |
| 9 | min_value | 最小值 | min_value | decimal(12, 4) |  | 数值 (UFDouble) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |