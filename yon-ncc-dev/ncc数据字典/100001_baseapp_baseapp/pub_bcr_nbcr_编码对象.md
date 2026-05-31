# |<<

**编码对象 (pub_bcr_nbcr / nc.pub.billcode.vo.NeedBCRVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4706.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nbcr | 主键 | pk_nbcr | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | codelenth | 最大长度 | codelenth | int |  | 整数 (Integer) |
| 4 | codescope | 支持范围 | codescope | varchar(10) |  | 字符串 (String) |
| 5 | codestyle | 编码方式 | codestyle | varchar(10) |  | 字符串 (String) |
| 6 | metaid | 元数据id | metaid | varchar(50) |  | 字符串 (String) |
| 7 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | orgtype | 关联组织类型 | orgtype | varchar(50) |  | 字符串 (String) |