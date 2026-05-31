# |<<

**智能报表预置数据 (smartba_presetdata / nc.vo.smartba.data.PresetData)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5372.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_presetdata | 主键ID | pk_presetdata | char(20) | √ | 主键 (UFID) |
| 2 | domain | 领域编号 | domain | varchar(50) | √ | 字符串 (String) |
| 3 | domainname | 领域名称 | domainname | varchar(50) |  | 字符串 (String) |
| 4 | domainresid | 领域名称多语 | domainresid | varchar(50) |  | 字符串 (String) |
| 5 | moduleid | 模块编号 | moduleid | varchar(50) | √ | 字符串 (String) |
| 6 | modulename | 模块名称 | modulename | varchar(50) |  | 字符串 (String) |
| 7 | moduleresid | 模块名称多语 | moduleresid | varchar(50) |  | 字符串 (String) |
| 8 | defaultpreviewappcode | 默认预览应用应用编码 | defaultpreviewappcode | varchar(20) |  | 字符串 (String) |
| 9 | defaultpublishpage | 默认发布页面 | defaultpublishpage | varchar(1000) |  | 字符串 (String) |
| 10 | type | 节点类型 | type | varchar(50) |  | 字符串 (String) |
| 11 | dimensionclass | 自定义维度处理类 | dimensionclass | varchar(200) |  | 字符串 (String) |
| 12 | dimensionjspath | 自定义维度处理前端页面路径 | dimensionjspath | varchar(200) |  | 字符串 (String) |
| 13 | filtrateclass | 自定义筛选处理类 | filtrateclass | varchar(200) |  | 字符串 (String) |
| 14 | filtratejspath | 自定义筛选处理前端页面路径 | filtratejspath | varchar(200) |  | 字符串 (String) |
| 15 | queryconditionjspath | 自定义参照过滤前端页面 | queryconditionjspath | varchar(200) |  | 字符串 (String) |
| 16 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |