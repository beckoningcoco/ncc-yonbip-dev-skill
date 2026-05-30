# |<<

**报表定义表 (hr_rpt_def / nc.vo.hi.repdef.RepDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2695.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rpt_def | 主键 | pk_rpt_def | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_bu | 业务单元 | pk_bu | char(20) |  | 主键 (UFID) |
| 4 | parnodepk | 父节点主键 | parnodepk | char(20) |  | 主键 (UFID) |
| 5 | nodetype | 节点类型 | nodetype | int |  | 节点类型 (nodetype) |  | 1=文件夹节点; |