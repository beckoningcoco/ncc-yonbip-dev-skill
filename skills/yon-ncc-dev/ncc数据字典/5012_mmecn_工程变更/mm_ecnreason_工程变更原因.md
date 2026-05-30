# |<<

**工程变更原因 (mm_ecnreason / nc.vo.ecn.ecnreason.entity.EcnreasonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3677.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ecnreason | 工程变更原因主键 | pk_ecnreason | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | vcode | 变更原因编码 | vcode | varchar(20) |  | 字符串 (String) |
| 4 | vname | 变更原因名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | vdiscript | 描述 | vdiscript | varchar(50) |  | 字符串 (String) |
| 6 | enablestate | 启用状态 | enablestate | int | √ | 启用状态 (EnableStateEnum) |  | 2=已启用; |