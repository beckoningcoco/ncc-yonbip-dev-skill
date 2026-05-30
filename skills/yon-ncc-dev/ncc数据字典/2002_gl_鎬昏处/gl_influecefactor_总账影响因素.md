# |<<

**总账影响因素 (gl_influecefactor / nc.vo.gl.reconcile.influecefactor.InflueceFactorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2427.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_influecefactor | 主键 | pk_influecefactor | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | entityid | 对应基础档案 | entityid | varchar(36) | √ | 实体 (entity) |
| 5 | property | 属性ID | property | varchar(200) |  | 字符串 (String) |
| 6 | detailfield | 分录字段 | detailfield | varchar(50) |  | 字符串 (String) |
| 7 | jointype | 关联方式 | jointype | varchar(50) |  | 关联方式 (jointype) | 1 | 1=等于; |