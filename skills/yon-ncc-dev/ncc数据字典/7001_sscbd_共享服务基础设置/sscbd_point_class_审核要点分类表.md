# |<<

**审核要点分类表 (sscbd_point_class / nc.vo.sscbd.sscbase.pointclass.SSCPointClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5531.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pointclass | 主键 | pk_pointclass | char(20) | √ | 主键 (UFID) |
| 2 | code | 审核要点分类编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 审核要点分类名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | innercode | 上级分类编码 | innercode | varchar(50) |  | 字符串 (String) |
| 5 | pk_sscunit | 共享中心 | pk_sscunit | varchar(20) | √ | 共享服务中心 (sscunit) |