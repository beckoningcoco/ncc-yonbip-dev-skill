# |<<

**业务活动按钮关联实体 (sm_busiactive_btn / nc.vo.sm.funcreg.BusiActiveRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5288.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | 主属性 | pk_relation | char(20) | √ | 主键 (UFID) |
| 2 | pk_busiactive | 业务活动 | pk_busiactive | varchar(20) |  | 业务活动实体 (businessaction) |
| 3 | pk_butn | 拥有按钮 | pk_butn | varchar(20) |  | 按钮注册实体 (butnreginfo) |