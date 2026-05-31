# |<<

**知识库条目 (bd_know_item / com.yonyou.yh.nhis.bd.ecd.vo.BdKnowItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/873.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_konwitem | 知识库主键 | pk_konwitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_knowparentitem | 父条目主键 | pk_knowparentitem | varchar(50) |  | 字符串 (String) |
| 3 | pk_knowbase | 知识库条目主键 | pk_knowbase | varchar(20) |  | 知识库 (BdKnowBaseVO) |
| 4 | title | 条目标题 | title | varchar(200) |  | 字符串 (String) |
| 5 | keyword | 条目关键字 | keyword | varchar(200) |  | 字符串 (String) |
| 6 | cont | 条目HTML内容 | cont | image |  | BLOB (BLOB) |
| 7 | sort | 同级别条目序号 | sort | int |  | 整数 (Integer) |
| 8 | pk_create_dept | 创建科室 | pk_create_dept | varchar(20) |  | 组织_部门 (dept) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |