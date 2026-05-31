# |<<

**模板公式 (iufo_dxrela_body / nc.vo.hbbb.dxrelation.DXRelationBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3422.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dxrela_body | 公式主键 | pk_dxrela_body | char(20) | √ | 主键 (UFID) |
| 2 | pk_measure | 合并报表项目 | pk_measure | varchar(20) |  | 合并报表项目 (project) |
| 3 | pk_dxrela_head | 所属抵销模板 | pk_dxrela_head | varchar(50) |  | 字符串 (String) |
| 4 | type | 方向 | type | int | √ | 借贷的方向 (direction) |  | 0=借方; |