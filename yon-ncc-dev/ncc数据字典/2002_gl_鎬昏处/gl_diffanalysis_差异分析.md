# |<<

**差异分析 (gl_diffanalysis / nc.vo.gl.diffanalysis.DiffAnalysisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2406.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diffanaly | 差异分析主键 | pk_diffanaly | char(20) | √ | 主键 (UFID) |
| 2 | father_pk | 上级项目 | father_pk | varchar(20) |  | 差异分析 (diffanalysis) |
| 3 | code | 差异分析项编码 | code | varchar(50) | √ | 字符串 (String) |
| 4 | name | 差异分析项名称 | name | varchar(500) | √ | 字符串 (String) |
| 5 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 6 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 7 | pk_org_v | 组织版本 | pk_org_v | varchar(20) | √ | 组织_版本信息 (org_v) |
| 8 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | memcode | 助记码 | memcode | varchar(50) |  | 字符串 (String) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |