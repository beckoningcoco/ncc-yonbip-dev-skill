# |<<

**BQ移动发布定义 (bi_mobile_publish_def / uap.bq.mobile.publish.vo.BQMblPubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1202.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | 移动发布PK | pk | char(20) | √ | 主键 (UFID) |
| 2 | pk_dir | 移动发布分类 | pk_dir | varchar(20) |  | BQ移动发布目录 (BQMblPubDirVO) |
| 3 | code | 移动发布编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 移动发布名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pk_obj | 发布对象PK | pk_obj | varchar(50) |  | 字符串 (String) |
| 6 | obj_type | 发布对象类型 | obj_type | varchar(50) |  | 对象类型 (OpenObjectType) |  | 1=自由报表; |