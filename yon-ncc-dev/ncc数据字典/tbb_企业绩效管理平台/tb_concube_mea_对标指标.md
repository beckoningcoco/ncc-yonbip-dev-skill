# |<<

**对标指标 (tb_concube_mea / nc.vo.tb.form.query.TbContrastCubeMea)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5706.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_parent | 上级PK | pk_parent | varchar(50) |  | 字符串 (String) |
| 3 | pk_mea | 指标PK | pk_mea | varchar(50) |  | 字符串 (String) |
| 4 | idx | 次序 | idx | int |  | 整数 (Integer) |
| 5 | unit | 计算单位 | unit | varchar(50) |  | 字符串 (String) |
| 6 | info | 注释 | info | varchar(50) |  | 字符串 (String) |
| 7 | express | 计算公式 | express | varchar(50) |  | 字符串 (String) |
| 8 | isshowper | 是否百分比显示 | isshowper | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isshowq | 是否显示百分比 | isshowq | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | num | 小数位 | num | int |  | 整数 (Integer) |
| 11 | isedit | 是否修改 | isedit | char(1) |  | 布尔类型 (UFBoolean) |