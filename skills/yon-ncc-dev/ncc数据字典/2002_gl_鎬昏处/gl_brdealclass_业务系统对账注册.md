# |<<

**业务系统对账注册 (gl_brdealclass / nc.vo.gl.busirecon.dealclass.BRDealClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2354.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_brdealclass | 主键 | pk_brdealclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_template | 单据模板主键 | pk_template | char(20) |  | 主键 (UFID) |
| 3 | nodecode | 单据模板节点编码 | nodecode | varchar(50) |  | 字符串 (String) |
| 4 | moduleid | 来源系统标识 | moduleid | varchar(50) |  | 字符串 (String) |
| 5 | classname | 业务系统实现接口 | classname | varchar(200) |  | 字符串 (String) |
| 6 | brsettingqrypanelclass | 业务系统注册面板 | brsettingqrypanelclass | varchar(200) |  | 字符串 (String) |
| 7 | bridgecode | 联查菜单编码 | bridgecode | varchar(50) |  | 字符串 (String) |
| 8 | glnodecode | 总账设置节点编码 | glnodecode | varchar(20) |  | 总账设置节点 (enum) |  | 200260SETG=对账设置-集团; |