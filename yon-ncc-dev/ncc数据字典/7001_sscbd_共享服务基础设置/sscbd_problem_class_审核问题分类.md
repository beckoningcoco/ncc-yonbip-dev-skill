# |<<

**审核问题分类 (sscbd_problem_class / nc.vo.sscbd.sscbase.problemclass.SSCProblemClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5534.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_class | 主键 | pk_class | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_sscunit | 共享服务中心主键 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 5 | innercode | 内编码 | innercode | varchar(50) |  | 字符串 (String) |
| 6 | memo | 备注 | memo | varchar(100) |  | 字符串 (String) |