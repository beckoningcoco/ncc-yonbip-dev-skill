# |<<

**分析主题定义 (bi_cube_def / nc.vo.bi.cube.CubeDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1190.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | 定义主键 | guid | char(20) | √ | 主键 (UFID) |
| 2 | dirid | 分类 | dirid | varchar(20) |  | 分析主题分类 (cubedir) |
| 3 | defcode | 分析主题编码 | defcode | varchar(50) |  | 字符串 (String) |
| 4 | defname | 分析主题名称 | defname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | dsname | 数据源 | dsname | varchar(50) |  | 数据源 (dsenum) |  | 0=当前数据源; |