<script type= "text/javascript" src = "js/countries.js"></script>
            
            <div class="breadcome-area">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="breadcome-list single-page-breadcome">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <!-- <div class="breadcome-heading">
                                            <form role="search" class="sr-input-func">
                                                <input type="text" placeholder="Search..." class="search-int form-control">
                                                <a href="#"><i class="fa fa-search"></i></a>
                                            </form>
                                        </div> -->
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <ul class="breadcome-menu">
                                            <li><a href="#">Home</a> <span class="bread-slash">/</span>
                                            </li>
                                            <li><span class="bread-blod">Add Student</span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
               
        <!-- Single pro tab review Start-->
        <div class="single-pro-review-area mt-t-30 mg-b-15">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="product-payment-inner-st">
                            <ul id="myTabedu1" class="tab-review-design">
                                <li class="active"><a href="#description">Basic Information</a></li>                       
                            </ul>
                            <div id="myTabContent" class="tab-content custom-product-edit">
                                <div class="product-tab-list tab-pane fade active in" id="description">
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="review-content-section">
                                                <div id="dropzone1" class="pro-ad">
                                                    <form action="sms.controller.AddStudent" method="post" class="dropzone dropzone-custom needsclick add-professors" id="demo1-upload">
                                                        <div class="row">
                                                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                                                <div class="form-group">
                                                                	<input type="text" class="form-control" placeholder="Full Name" name="name">
                                                            	</div>
                                                                <div class="form-group">
                                                                    <input name="fname" type="text" class="form-control" placeholder="Father's Name">
                                                                </div>
                                                                <div class="form-group">
                                                                    <select name="branch" class="form-control">
																		<option value="none" selected="" disabled="">Choose Branch</option>
																		<option value="CSE">CSE</option>
																		<option value="Civil">Civil</option>
																		<option value="ME">ME</option>
																		<option value="EEE">EEE</option>
																		<option value="EE">EE</option>
																
																  </select>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="mobileno" type="text" class="form-control" placeholder="Mobile No">
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="dob" type="date" class="form-control" placeholder="Date of Birth">
                                                                </div>
                                                                <div class="form-group">
                                                                    <select name="gender" class="form-control">
																		<option value="none" selected="" disabled="">Choose Gender</option>
																		<option value="Female">Feamale</option>
																		<option value="Male">Male</option>
																		<option value="Other">Other</option>
																
																	</select>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="emailid" type="text" class="form-control" placeholder="Email id">
                                                                </div>
                                                                <div class="form-group">
                                                                    <p><b>Permanent Address</b></p>
                                                                </div>
                                                                <div class="form-group">
                                                                    <select name="permanent_country" id="country" class="form-control">
																			
																		</select>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="permanent_district" type="text" class="form-control" placeholder="District">
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="permanent_landmark" id="finish" type="text" class="form-control" placeholder="Landmark">
                                                                </div>
                                                                <div class="form-group">
                                                                    <p><b>Present Address</b></p>
                                                                </div>
                                                                <div class="form-group">
                                                                   <select name="present_country" id="country1" class="form-control">
																			
																		</select>
                                                                   </div>
                                                                <div class="form-group">
                                                                    <input name="present_district" type="text" class="form-control" placeholder="District">
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="present_landmark" id="finish" type="text" class="form-control" placeholder="Landmark">
                                                                </div>
                                                                
                                                            </div>
                                                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                                                <div class="form-group">
                                                                    <input name="regdno" type="text" class="form-control" placeholder="Regdno">
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="mname" type="text" class="form-control" placeholder="Mothername">
                                                                </div>
                                                                <div class="form-group">
                                                                    <select name="semester" class="form-control" placeholder="Semester">
																		<option value="none" selected="" disabled="">Semester</option>
																		<option value="1st Semester">1st</option>
																		<option value="2nd Semester">2nd</option>
																		<option value="3rd Semester">3rd</option>
																		<option value="4th Semester">4th</option>
																		<option value="5th Semester">5th</option>
																		<option value="6th Semester">6th</option>
																		<option value="7th Semester">7th</option>
																		<option value="8th Semester">8th</option>
																	</select>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="adhaarno" type="text" class="form-control" placeholder="Adhaarno">
                                                                </div>
                                                                <div class="form-group">
                                                                    <select name="bloodgroup" class="form-control" >
																		<option value="none" selected="" disabled="">Choose Blood group</option>
																		<option value="A+">A+</option>
																		<option value="A-">A-</option>
																		<option value="B+">B+</option>
																		<option value="B-">B-</option>
																		<option value="AB+">AB+</option>
																		<option value="AB-">AB-</option>
																		<option value="O+">O+</option>
																		<option value="O-">O-</option>
																	</select>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="session" type="text" class="form-control" placeholder="Session">
                                                                </div>
                                                                 <div class="form-group" style="height: 75px;">
                                                                    <p></p>
                                                                </div>
                                                                 
                                                                <div class="form-group">
                                                                    <select name="permanent_state" id="state" class="form-control">
																			
																		</select>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="permanent_city" type="text" class="form-control" placeholder="City">
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="permanent_pincode" type="text" class="form-control" placeholder="Pincode">
                                                                </div>
                                                                <div class="form-group" style="height: 23px;">
                                                                    <p></p>
                                                                </div>
                                                                 
                                                                <div class="form-group">
                                                                    <select name="present_state" id="state1" class="form-control">
																			
																		</select>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="present_city" type="text" class="form-control" placeholder="City">
                                                                </div>
                                                                <div class="form-group">
                                                                    <input name="present_pincode" type="text" class="form-control" placeholder="Pincode">
                                                                </div>
                                                                
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-lg-12">
                                                                <div class="payment-adress">
                                                                    <button type="submit" class="btn btn-primary waves-effect waves-light">Submit</button>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
       


<script language="javascript">
	populateCountries("country", "state"); // first parameter is id of country drop-down and second parameter is id of state drop-down
	populateCountries("country1", "state1");
	
</script>
    <!-- jquery
		============================================ -->
    <script src="js/vendor/jquery-1.12.4.min.js"></script>
    <!-- bootstrap JS
		============================================ -->
    <script src="js/bootstrap.min.js"></script>
    <!-- wow JS
		============================================ -->
    <script src="js/wow.min.js"></script>
    <!-- price-slider JS
		============================================ -->
    <script src="js/jquery-price-slider.js"></script>
    <!-- meanmenu JS
		============================================ -->
    <script src="js/jquery.meanmenu.js"></script>
    <!-- owl.carousel JS
		============================================ -->
    <script src="js/owl.carousel.min.js"></script>
    <!-- sticky JS
		============================================ -->
    <script src="js/jquery.sticky.js"></script>
    <!-- scrollUp JS
		============================================ -->
    <script src="js/jquery.scrollUp.min.js"></script>
    <!-- mCustomScrollbar JS
		============================================ -->
    <script src="js/scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="js/scrollbar/mCustomScrollbar-active.js"></script>
    <!-- metisMenu JS
		============================================ -->
    <script src="js/metisMenu/metisMenu.min.js"></script>
    <script src="js/metisMenu/metisMenu-active.js"></script>
    <!-- morrisjs JS
		============================================ -->
    <script src="js/sparkline/jquery.sparkline.min.js"></script>
    <script src="js/sparkline/jquery.charts-sparkline.js"></script>
    <!-- calendar JS
		============================================ -->
    <script src="js/calendar/moment.min.js"></script>
    <script src="js/calendar/fullcalendar.min.js"></script>
    <script src="js/calendar/fullcalendar-active.js"></script>
    <!-- maskedinput JS
		============================================ -->
    <script src="js/jquery.maskedinput.min.js"></script>
    <script src="js/masking-active.js"></script>
    <!-- datepicker JS
		============================================ -->
    <script src="js/datepicker/jquery-ui.min.js"></script>
    <script src="js/datepicker/datepicker-active.js"></script>
    <!-- form validate JS
		============================================ -->
    <script src="js/form-validation/jquery.form.min.js"></script>
    <script src="js/form-validation/jquery.validate.min.js"></script>
    <script src="js/form-validation/form-active.js"></script>
    <!-- dropzone JS
		============================================ -->
    <script src="js/dropzone/dropzone.js"></script>
    <!-- tab JS
		============================================ -->
    <script src="js/tab.js"></script>
    <!-- plugins JS
		============================================ -->
    <script src="js/plugins.js"></script>
    <!-- main JS
		============================================ -->
    <script src="js/main.js"></script>
    <!-- tawk chat JS
		============================================ -->
    <script src="js/tawk-chat.js"></script>
</body>

</html>