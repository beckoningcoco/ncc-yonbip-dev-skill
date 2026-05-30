# |<<

**岗位职责 (om_postresp / nc.vo.om.post.PostRespVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3971.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | 岗位职责主键 | pk_post_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_post | 岗位 | pk_post | varchar(20) |  | 基准岗位 (poststd) |
| 3 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 4 | lastflag | 是否最近记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_resptype | 职责类型 | pk_resptype | varchar(20) | √ | 职责类型(自定义档案) (Defdoc-HRJF001_0xx) |
| 6 | worktype | 工作类型 | worktype | varchar(50) |  | 字符串 (String) |
| 7 | respdesc | 简要描述 | respdesc | varchar(50) |  | 字符串 (String) |