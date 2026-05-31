# |<<

**设置信息项目表 (gl_extendreportit / nc.vo.gl.glextendreport_item.extendreportit)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2421.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_extendreportitem | 主键 | pk_extendreportitem | char(20) | √ | 主键 (UFID) |
| 2 | caption | 显示名称 | caption | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | issqlflag | 是否查询标志 | issqlflag | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | isselectedflag | 必选项标志 | isselectedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_bdinfo | 档案PK | pk_bdinfo | char(20) |  | 主键 (UFID) |
| 6 | bdtablealias | 档案表别名 | bdtablealias | char(20) |  | 主键 (UFID) |
| 7 | resid | 资源ID | resid | varchar(20) |  | 字符串 (String) |