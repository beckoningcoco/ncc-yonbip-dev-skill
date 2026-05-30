# |<<

**出入院标准 (hp_dl_standard / com.yonyou.yh.nhis.hp.dalian.vo.DlHpStandardVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2608.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_standard | 出入院标准主键 | pk_standard | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 机构主键 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_pati | 患者主键 | pk_pati | varchar(50) |  | 字符串 (String) |
| 5 | pk_pv | 就诊主键 | pk_pv | varchar(50) |  | 字符串 (String) |
| 6 | code_org | 医院编号 | code_org | varchar(50) |  | 字符串 (String) |
| 7 | code_op | 子门诊号 | code_op | varchar(50) |  | 字符串 (String) |
| 8 | code_hp | 保险编号 | code_hp | varchar(50) |  | 字符串 (String) |
| 9 | code_treat | 治疗序号 | code_treat | int |  | 整数 (Integer) |
| 10 | hp_pvtype | 医保就诊分类 | hp_pvtype | varchar(50) |  | 字符串 (String) |
| 11 | name_drgs | 单病种名称 | name_drgs | varchar(50) |  | 字符串 (String) |
| 12 | code_drgs | 单病种编码 | code_drgs | varchar(50) |  | 字符串 (String) |
| 13 | type_standard | 标准类型 | type_standard | varchar(50) |  | 字符串 (String) |
| 14 | code_standard | 标准编码 | code_standard | varchar(50) |  | 字符串 (String) |
| 15 | cont_standard | 标准内容 | cont_standard | varchar(200) |  | 字符串 (String) |
| 16 | date_gen | 生成时间 | date_gen | char(19) |  | 日期时间 (UFDateTime) |
| 17 | code_phy | 医保医师编码 | code_phy | varchar(50) |  | 字符串 (String) |
| 18 | code_phy_att | 医保主治医师编码 | code_phy_att | varchar(50) |  | 字符串 (String) |
| 19 | code_phy_dir | 医保主任医师编码 | code_phy_dir | varchar(50) |  | 字符串 (String) |
| 20 | type_trans | 传输类型 | type_trans | varchar(50) |  | 字符串 (String) |
| 21 | date_trans | 传输时间 | date_trans | char(19) |  | 日期时间 (UFDateTime) |
| 22 | val_standard | 标准值 | val_standard | varchar(50) |  | 字符串 (String) |
| 23 | desc_standard | 标准描述 | desc_standard | varchar(50) |  | 字符串 (String) |
| 24 | pk_phy | 医师主键 | pk_phy | varchar(50) |  | 字符串 (String) |
| 25 | pk_phy_att | 主治医师主键 | pk_phy_att | varchar(50) |  | 字符串 (String) |
| 26 | pk_phy_dir | 主任医师主键 | pk_phy_dir | varchar(50) |  | 字符串 (String) |
| 27 | flag_hp | 医保上传成功标志 | flag_hp | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | def1 | 冗余字段1 | def1 | varchar(50) |  | 字符串 (String) |
| 29 | def2 | 冗余字段2 | def2 | varchar(50) |  | 字符串 (String) |
| 30 | def3 | 冗余字段3 | def3 | varchar(50) |  | 字符串 (String) |
| 31 | def4 | 冗余字段4 | def4 | varchar(50) |  | 字符串 (String) |
| 32 | def5 | 冗余字段5 | def5 | varchar(50) |  | 字符串 (String) |
| 33 | def6 | 冗余字段6 | def6 | varchar(50) |  | 字符串 (String) |
| 34 | def7 | 冗余字段7 | def7 | varchar(50) |  | 字符串 (String) |
| 35 | def8 | 冗余字段8 | def8 | varchar(50) |  | 字符串 (String) |
| 36 | def9 | 冗余字段9 | def9 | varchar(50) |  | 字符串 (String) |
| 37 | def10 | 冗余字段10 | def10 | varchar(50) |  | 字符串 (String) |