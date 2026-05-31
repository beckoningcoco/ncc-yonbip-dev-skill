# |<<

**工作中心组 (pd_wkg / nc.vo.pd.wk.wkg.entity.WkgHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4392.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wkgid | 工作中心组 | pk_wkgid | char(20) | √ | 主键 (UFID) |
| 2 | vwkgcode | 工作中心组编码 | vwkgcode | varchar(40) |  | 字符串 (String) |
| 3 | vwkgname | 工作中心组名称 | vwkgname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (EnableStateEnum) |  | 2=已启用; |